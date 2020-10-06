package org.maslov.info.interfaces.controller;

import org.maslov.info.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private org.springframework.web.context.WebApplicationContext context;

    @RequestMapping(value = "/")
    public String home() {
        Sender sender = context.getBean("sender", Sender.class);
        return sender.sendMessage("My Message");
    }
}
