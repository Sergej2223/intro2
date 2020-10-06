package org.maslov.info.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WirelessSenderImpl implements Sender {
    private final Receiver receiver;

@Autowired
    public WirelessSenderImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String sendMessage(String message){

    return receiver.getMessage("Wireless data transmission" + message);
    }
}
