package org.hieunguyen.abstractfactory.gcp;


import org.hieunguyen.abstractfactory.Instance;
import org.hieunguyen.abstractfactory.ResourceFactory;
import org.hieunguyen.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity size) {
        return new GoogleComputeEngineInstance(size);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
