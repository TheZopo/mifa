package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Room;

public class JoinedRoomPacket extends Packet {
    private Room room;

    private String nickname;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public JoinedRoomPacket(String nickname, Room room) {
        this.room = room;
        this.nickname = nickname;
    }
}