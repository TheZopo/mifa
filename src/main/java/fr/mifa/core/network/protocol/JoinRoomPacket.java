package fr.mifa.core.network.protocol;

public class JoinRoomPacket extends Packet {
    int roomId;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public JoinRoomPacket(int roomId) {
        this.roomId = roomId;
    }
}
