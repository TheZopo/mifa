package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;

import java.io.IOException;
import java.io.ObjectOutput;

public class SendPacketTask implements Runnable {
    private PacketManager packetManager;
    private Packet packet;

    @Override
    public void run() {
        if (packet == null || packetManager == null) {
            return;
        }
        ObjectOutput stream = packetManager.getOutputStream();
        try {
            stream.writeObject(packet);
            stream.flush(); // TODO do we need to flush every time ?
        }
        catch (IOException ex) {
            //TODO
        }
    }

    public SendPacketTask(PacketManager packetManager, Packet packet) {
        this.packetManager = packetManager;
        this.packet = packet;
    }
}
