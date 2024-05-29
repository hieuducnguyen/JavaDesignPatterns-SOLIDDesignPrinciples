package org.hieunguyen.abstractfactory.aws;


import org.hieunguyen.abstractfactory.Instance;
import org.hieunguyen.abstractfactory.Storage;

//Represents a concrete product in a family "Amazon Web services"
public class Ec2Instance extends Instance {

    public Ec2Instance(Instance.Capacity capacity) {
        super(capacity);
        //Map capacity to ec2 instance types. Use aws API to provision
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Ec2Instance");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
