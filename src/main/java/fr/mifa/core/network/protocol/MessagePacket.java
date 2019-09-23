package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Message;

public class MessagePacket extends Packet {
    private Message message;

    private int roomId;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}