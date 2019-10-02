package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Room;

public class JoinedRoomPacket extends Packet {
    private Room room;

    private String address;
    private int port;

    private String nickname;

    public JoinedRoomPacket(String nickname, Room room) {
        this.room = room;
        this.nickname = nickname;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}