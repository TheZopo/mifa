package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread implements IClient {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    private Socket _socket;
    private Socket socket;
    private ObjectOutput oos;

    public Client(Socket socket) {
        this.socket = socket;
    }

    public Client() { }

    @Override
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

    @Override
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

    @Override
    public void send(Packet packet) {
        // TODO get newSingleThreadExecutor and launch SendPacketTask
    }

    @Override
    public void run() {
        //TODO receive loop
    }
}
