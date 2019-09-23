package fr.mifa.core.network.protocol;

import javafx.util.Pair;

import java.util.ArrayList;

public class RoomListPacket extends Packet {
    private ArrayList<Pair<Integer, String>> rooms;

    public ArrayList<Pair<Integer, String>> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Pair<Integer, String>> rooms) {
        this.rooms = rooms;
    }
}
