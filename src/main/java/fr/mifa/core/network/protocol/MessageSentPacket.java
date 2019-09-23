package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Message;

public class MessageSentPacket {
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}