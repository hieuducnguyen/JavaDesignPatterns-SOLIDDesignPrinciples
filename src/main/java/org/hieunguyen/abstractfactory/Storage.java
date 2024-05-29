package org.hieunguyen.abstractfactory;

//Represents an abstract product
public abstract class Storage {

    private final int capacityInMib;

    protected Storage(int capacityInMib) {
        this.capacityInMib = capacityInMib;
    }

    public abstract String getId();

}
