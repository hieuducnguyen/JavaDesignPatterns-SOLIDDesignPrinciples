package org.hieunguyen.dependencyinversion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        TextFormatter textFormatter = new TextFormatter();
        JSONFormatter jsonFormatter = new JSONFormatter();

        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
//        try (PrintWriter printWriter = new PrintWriter(new FileWriter("test.json"))) {
        try (PrintWriter printWriter = new PrintWriter(System.out)) {
            printer.writeMessage(msg, jsonFormatter,printWriter);
        }
    }

}
