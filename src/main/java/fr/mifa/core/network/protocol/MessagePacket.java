package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Message;

public class MessagePacket extends Packet {
    private Message _message;

    public Message getMessage() {
        return _message;
    }

    public void setMessage(Message message) {
        this._message = message;
    }
}
