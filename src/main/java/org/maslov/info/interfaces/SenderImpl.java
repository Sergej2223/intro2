package org.maslov.info.interfaces;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SenderImpl implements Sender {
    private final Receiver receiver;

    @Autowired
    public SenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String sendMessage(String message) {
        return receiver.getMessage("Wired data transmission: " + message);

    }
}

