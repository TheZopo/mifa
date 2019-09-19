package fr.mifa.core.models;

public class TextMessage extends Message {
    private String _text;

    public String getText() {
        return _text;
    }

    public void setText(String text) {
        this._text = text;
    }
}
