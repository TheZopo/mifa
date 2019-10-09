package fr.mifa.core.models;

import java.util.ArrayList;

public abstract class Message extends Model {
    private String roomName;
    private String authorName;
    private long timestamp;
    private ArrayList<Reaction> reactions;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public ArrayList<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(ArrayList<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Message(String roomName, String authorName) {
        this.roomName = roomName;
        this.timestamp = System.currentTimeMillis();
        this.authorName = authorName;
        this.reactions = new ArrayList<>();
    }
}
