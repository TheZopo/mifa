package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Message;

public class MessageSentPacket extends Packet {
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public MessageSentPacket(Message message) {
        this.message = message;
    }
}