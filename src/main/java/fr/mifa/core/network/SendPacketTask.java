package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SendPacketTask implements Runnable {
    private IClient _client;

    private Packet _packet;

    @Override
    public void run() {
        if (_packet == null || _client == null) {
            return;
        }
        ObjectOutput stream = _client.getOutputStream();
        try {
            stream.writeObject(_packet);
            stream.flush(); // TODO do we need to flush every time ?
        }
        catch (IOException ex) {
            //TODO
        }
    }

    public SendPacketTask(IClient client, Packet packet) {
        _client = client;
        _packet = packet;
    }
}
