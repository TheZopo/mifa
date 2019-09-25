package fr.mifa.core.network.protocol;

public class LeaveRoomPacket extends Packet {
    String roomName;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public LeaveRoomPacket(String roomName) {
        this.roomName = roomName;
    }
}
