package fr.mifa.core.network.protocol;

public class LeftRoomPacket extends Packet {
    private String nickname;

    private int roomId;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LeftRoomPacket(String nickname, int roomId) {
        this.nickname = nickname;
        this.roomId = roomId;
    }
}