package fr.mifa.core.models;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;

import fr.mifa.core.network.RoomPacketManager;

public class Room extends Model {
    private String name;
    private String address;
    private int port;
    private ArrayList<User> users;
    private ArrayList<Message> history;

    private transient RoomPacketManager packetManager;

    public Room(String name) {
        this.users = new ArrayList<>();
        this.name = name;
        this.history = new ArrayList<>();
    }

    public Room(String name, String address) {
        super();
        this.name = name;
        this.address = address;
        this.port = 3000 + getId();

        this.users = new ArrayList<>();
        this.history = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Message> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Message> history) {
        this.history = history;
    }

    public RoomPacketManager getPacketManager() {
        return packetManager;
    }

    public void setPacketManager(RoomPacketManager packetManager) {
        this.packetManager = packetManager;
        this.packetManager.start();
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
