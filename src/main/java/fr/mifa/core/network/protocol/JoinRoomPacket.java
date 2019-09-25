package fr.mifa.core.network.protocol;

public class JoinRoomPacket extends Packet {
    String roomName;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public JoinRoomPacket(String roomName) {
        this.roomName = roomName;
    }
}
