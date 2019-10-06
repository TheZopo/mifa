package fr.mifa.core.models;

public class FileMessage extends Message {
    private byte[] content;

    private String filename;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FileMessage(String roomName, String authorName, byte[] content, String filename) {
        super(roomName, authorName);
        this.content = content;
        this.filename = filename;
    }
}
