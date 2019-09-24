package fr.mifa.core.models;

import java.util.ArrayList;

public class Room extends Model {

    private String name;

    private ArrayList<User> users;

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

    public Room() {
        this.users = new ArrayList<>();
        this.name = "Room " + this.getId(); //TODO change
    }
}
