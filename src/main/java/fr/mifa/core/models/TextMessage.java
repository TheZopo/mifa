package fr.mifa.core.models;

public class TextMessage extends Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextMessage(String roomName, String authorName, String text) {
        super(roomName, authorName);
        this.text = text;
    }
}
