package org.hieunguyen.factorymethod;


import org.hieunguyen.factorymethod.message.Message;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        JSONMessageCreator jsonMessageCreator = new JSONMessageCreator();
        printMessage(jsonMessageCreator);
        List<Integer> list = new ArrayList<>();
        list.iterator();
    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.getMessage();
        System.out.println("message = " + message);
    }
}
