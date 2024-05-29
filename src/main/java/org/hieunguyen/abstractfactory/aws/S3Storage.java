package org.hieunguyen.abstractfactory.aws;


import org.hieunguyen.abstractfactory.Storage;

//Represents a concrete product in a family "Amazon Web Services"
public class S3Storage extends Storage {

    public S3Storage(int capacityInMib) {
        super(capacityInMib);
        //Use aws s3 api
        System.out.println("Allocated " + capacityInMib + " on S3");
    }

    @Override
    public String getId() {
        return "S31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
