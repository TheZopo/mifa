package fr.mifa.core.models;

import java.io.Serializable;

public abstract class Model implements Serializable {

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
