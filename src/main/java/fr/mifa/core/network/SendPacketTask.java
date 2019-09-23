package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;

import java.io.IOException;
import java.io.ObjectOutput;

public class SendPacketTask implements Runnable {
    private IClient client;
    private Packet packet;

    @Override
    public void run() {
        if (packet == null || client == null) {
            return;
        }
        ObjectOutput stream = client.getOutputStream();
        try {
            stream.writeObject(packet);
            stream.flush(); // TODO do we need to flush every time ?
        }
        catch (IOException ex) {
            //TODO
        }
    }

    public SendPacketTask(IClient client, Packet packet) {
        this.client = client;
        this.packet = packet;
    }
}
