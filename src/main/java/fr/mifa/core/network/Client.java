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

    private ObjectOutput _oos;

    public Client(Socket _socket) {
        this._socket = _socket;
    }

    public Client() { }

    @Override
    public ObjectOutput getOutputStream() {
        if (_socket != null) {
            if (_oos == null) {
                try {
                    OutputStream os = _socket.getOutputStream();
                    _oos = new ObjectOutputStream(os);
                }
                catch (IOException ex) {
                    logger.error(ex.toString());
                }
            }
            return _oos;
        }
        else {
            logger.warn("NULL client socket");
        }
        return null;
    }

    @Override
    public void connect(String address, int port) {
        try {
            _socket = new Socket(address, port);
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
