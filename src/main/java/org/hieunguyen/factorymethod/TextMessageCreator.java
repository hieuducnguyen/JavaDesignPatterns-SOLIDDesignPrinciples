package org.hieunguyen.factorymethod;


import org.hieunguyen.factorymethod.message.Message;
import org.hieunguyen.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public TextMessage createMessage() {
        return new TextMessage();
    }
}
