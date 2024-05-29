package org.hieunguyen.abstractfactory;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity size);

    Storage createStorage(int capacityInMib);

}
