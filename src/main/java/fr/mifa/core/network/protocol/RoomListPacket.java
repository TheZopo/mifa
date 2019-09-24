package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Room;
import org.javatuples.Pair;

import java.util.ArrayList;

public class RoomListPacket extends Packet {
    private ArrayList<Room> rooms;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public RoomListPacket(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
