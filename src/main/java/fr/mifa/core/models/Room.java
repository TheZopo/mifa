package fr.mifa.core.models;

import java.util.ArrayList;

public class Room extends Model {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Message> history;

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

    public Room(String name) {
        this.users = new ArrayList<>();
        this.name = name;
        this.history = new ArrayList<>();
    }
}
