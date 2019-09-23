package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread implements IClient {
    private Socket socket;
    private ObjectOutput oos;

    public Client(Socket _socket) {
        this.socket = _socket;
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
                    //TODO
                }
            }
            return oos;
        }
        else {
            //TODO
        }
        return null;
    }

    @Override
    public void connect(String address, int port) {
        try {
            socket = new Socket(address, port);
        }
        catch (UnknownHostException ex) {
            //TODO
        }
        catch (IOException ex) {
            //TODO
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
