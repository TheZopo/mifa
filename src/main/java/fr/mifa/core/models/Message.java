package fr.mifa.core.models;

public abstract class Message extends Model {
    private int roomId;

    private int authorId;

    private String authorName;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Message(int roomId) {
        this.roomId = roomId;
    }
}
