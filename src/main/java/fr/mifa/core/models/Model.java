package fr.mifa.core.models;

public abstract class Model {

    protected Model() {
        this.id = createID();
    }

    private int id;

    public int getId() {
        return id;
    }

    private static int idCounter = 0;

    protected static synchronized int createID()
    {
        return idCounter++;
    }
}
