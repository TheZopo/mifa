package fr.mifa.core.network;

import fr.mifa.core.network.protocol.Packet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectOutput;

public class SendPacketTask implements Runnable {
    private PacketManager packetManager;
    private Packet packet;

    private static final Logger logger = LoggerFactory.getLogger(SendPacketTask.class);

    @Override
    public void run() {
        if (packet == null || packetManager == null) {
            return;
        }
        ObjectOutput stream = packetManager.getOutputStream();
        try {
            stream.writeObject(packet);
            stream.flush();
        }
        catch (IOException ex) {
            logger.error(ex.toString());
        }
    }

    public SendPacketTask(PacketManager packetManager, Packet packet) {
        this.packetManager = packetManager;
        this.packet = packet;
    }
}
