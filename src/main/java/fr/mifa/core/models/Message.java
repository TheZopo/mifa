package fr.mifa.core.models;

public abstract class Message {
    private int _id;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }
}
