package fr.mifa.core.network.protocol;

public class JoinedRoomPacket extends Packet {
    private int roomId;

    private String nickname;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}