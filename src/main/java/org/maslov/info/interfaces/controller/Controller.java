package org.maslov.info.interfaces.controller;

import org.maslov.info.interfaces.Receiver;
import org.maslov.info.interfaces.ReceiverImpl;
import org.maslov.info.interfaces.Sender;
import org.maslov.info.interfaces.SenderImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Sender sender;
    private final Receiver receiver;

    public Controller() {
        this.receiver = new ReceiverImpl();
        this.sender = new SenderImpl( this.receiver );
    }

    @RequestMapping(value = "/")
    public String home() {
        return sender.sendMessage("Hello Word!");
    }
    }


