package fr.mifa.core.network.protocol;

public class LeaveRoomPacket extends Packet {
    int roomId;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LeaveRoomPacket(int roomId) {
        this.roomId = roomId;
    }
}
