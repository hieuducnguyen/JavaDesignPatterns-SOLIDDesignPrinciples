package org.hieunguyen.abstractfactory;


import org.hieunguyen.abstractfactory.aws.AwsResourceFactory;
import org.hieunguyen.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createInstance(Instance.Capacity capacity) {
        return resourceFactory.createInstance(capacity);
    }

    public Storage createStorage(int capacityInMib) {
        return resourceFactory.createStorage(capacityInMib);
    }

    public static void main(String[] args) {
        GoogleResourceFactory googleResourceFactory = new GoogleResourceFactory();
        AwsResourceFactory awsResourceFactory = new AwsResourceFactory();
        Client client = new Client(googleResourceFactory);
        client.createInstance(Instance.Capacity.large);
    }

}
