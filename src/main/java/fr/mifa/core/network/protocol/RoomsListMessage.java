package fr.mifa.core.network.protocol;

import fr.mifa.core.models.Room;
import java.util.ArrayList;

public class RoomsListMessage extends Packet {
    private ArrayList<Room> rooms;

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}