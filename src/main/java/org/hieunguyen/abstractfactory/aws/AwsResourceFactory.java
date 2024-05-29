package org.hieunguyen.abstractfactory.aws;


import org.hieunguyen.abstractfactory.Instance;
import org.hieunguyen.abstractfactory.ResourceFactory;
import org.hieunguyen.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity size) {
        return new Ec2Instance(size);
    }

    @Override
    public Storage createStorage(int capacityInMib) {
        return new S3Storage(capacityInMib);
    }

}
