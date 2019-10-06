package fr.mifa.core.network;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.concurrent.ExecutorService;

import fr.mifa.core.network.protocol.Packet;
import fr.mifa.core.utils.SendThreadProvider;

public abstract class RoomPacketManager extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(PacketManager.class);
    public static final int BUFFER_SIZE = 1024 * 1024;

    private MulticastSocket socket;
    private InetAddress group;
    private int port;
    private String address;

    public RoomPacketManager(String address, int port) {
        this.address = address;
        this.port = port;

        connect();
    }

    public void connect() {
        try {
            group = InetAddress.getByName(address);
            socket = new MulticastSocket(port);
            socket.joinGroup(group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(Packet packet) {
        ExecutorService executor = SendThreadProvider.INSTANCE.getExecutorService();
        Runnable task = () -> {
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(packet);
                byte[] data = baos.toByteArray();

                logger.info("Broadcasting multicast packet of size " + data.length);
                socket.send(new DatagramPacket(data, data.length, group, port));
            } catch(IOException e) {
                logger.error(e.toString());
            }
        };
        executor.execute(task);
    }

    @Override
    public void run() {
        try {
            while(true) {
                byte[] buffer = new byte[BUFFER_SIZE];
                socket.receive(new DatagramPacket(buffer, BUFFER_SIZE, group, port));

                ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
                ObjectInputStream ois = new ObjectInputStream(bais);

                Packet packet = (Packet) ois.readObject();
                processPacket(packet);
            }
        } catch (IOException e) {
            logger.error(e.toString());
        } catch (ClassNotFoundException e) {
            logger.error("Received packet is not a valid packet, skipping...");

        }
    }

    protected abstract void processPacket(Packet packet);
}
