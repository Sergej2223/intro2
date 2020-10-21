package org.maslov.info.interfaces.controller;

import org.maslov.info.interfaces.*;
import org.maslov.info.polzavatel.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {
    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;
    private Collection<User> users =  new ArrayList<>();
    @RequestMapping(value = "/{name}")
    public String home(@PathVariable("name") String name, Model model) {
        context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sender sender = context.getBean("wirelessSenderImpl", Sender.class);
        model.addAttribute("msg", sender.sendMessage("Hello " + name + "!"));
        return "test";
    }

    @RequestMapping(value = "/users")
    public String getUsers(Model model) {

        model.addAttribute("users", users );
        return "users";
    }
    @GetMapping(value = "/")
    public String getSignUp(){
        return "sign_up";
    }
    @PostMapping(value = "/")
    public String getSignUp(@ModelAttribute User user){
        users.add(user);
        return "redirect:/users";
    }
}

