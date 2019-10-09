package fr.mifa.core.models;

public abstract class Message extends Model {
    private String roomName;
    private String authorName;
    private long timestamp;

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

    public Message(String roomName, String authorName) {
        this.roomName = roomName;
        this.timestamp = System.currentTimeMillis();
        this.authorName = authorName;
    }
}
