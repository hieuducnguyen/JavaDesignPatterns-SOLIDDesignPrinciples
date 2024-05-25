package org.hieunguyen.factorymethod;


import org.hieunguyen.factorymethod.message.JSONMessage;
import org.hieunguyen.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public JSONMessage createMessage() {
        return new JSONMessage();
    }
}
