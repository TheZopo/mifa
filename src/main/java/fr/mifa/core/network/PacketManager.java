package fr.mifa.core.network;

import fr.mifa.core.models.User;
import fr.mifa.core.network.protocol.Packet;
import fr.mifa.core.utils.SendThreadProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;

public abstract class PacketManager extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(PacketManager.class);

    private Socket socket;
    private ObjectOutput oos;
    private ObjectInput ois;
    private User user;

    public PacketManager(Socket socket) {
        this.socket = socket;
    }

    public PacketManager() { }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ObjectOutput getOutputStream() {
        if (socket != null) {
            if (oos == null) {
                try {
                    OutputStream os = socket.getOutputStream();
                    oos = new ObjectOutputStream(os);
                }
                catch (IOException ex) {
                    logger.error(ex.toString());
                }
            }
            return oos;
        }
        else {
            logger.warn("NULL client socket");
        }
        return null;
    }

    public void connect(String address, int port) {
        try {
            socket = new Socket(address, port);
        }
        catch (UnknownHostException ex) {
            logger.error(ex.toString());
        }
        catch (IOException ex) {
            logger.error(ex.toString());
        }
    }

    public void send(Packet packet) {
        ExecutorService executor = SendThreadProvider.INSTANCE.getExecutorService();
        Runnable task = new SendPacketTask(this, packet);
        executor.execute(task);
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            ois = new ObjectInputStream(is);

            while (true) {
                Packet packet = (Packet) ois.readObject();
                processPacket(packet);
            }
        } catch (IOException ex) {
            logger.error(ex.toString());
        } catch (ClassNotFoundException e) {
            logger.error("Received packet is not a valid packet, skipping...");
        }
    }

    protected abstract void processPacket(Packet packet);
}
