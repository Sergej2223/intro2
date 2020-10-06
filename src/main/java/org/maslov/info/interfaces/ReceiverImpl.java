package org.maslov.info.interfaces;

import org.springframework.stereotype.Component;

@Component
public class ReceiverImpl implements Receiver {
    @Override
    public String getMessage(String message) {
        return message;
    }
}
