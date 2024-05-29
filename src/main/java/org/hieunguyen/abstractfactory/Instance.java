package org.hieunguyen.abstractfactory;

//Represents an abstract product
public abstract class Instance {


    protected Instance(Capacity capacity) {
        this.capacity = capacity;
    }

    public enum Capacity {micro, small, large}

    private final Capacity capacity;

    public abstract void start();

    public abstract void attachStorage(Storage storage);

    public abstract void stop();
}
