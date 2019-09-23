package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Room;

public class JoinedRoomPacket extends Packet {
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
