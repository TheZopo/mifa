package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Message;

public class MessageSentPacket extends Packet {
    private int roomId;

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public MessageSentPacket(int roomId, Message message) {
        this.roomId = roomId;
        this.message = message;
    }
}