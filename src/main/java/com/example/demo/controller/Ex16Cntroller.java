package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.UserForm;


@Controller
@RequestMapping("/ex16")
public class Ex16Cntroller {

    private List<String> messages = new ArrayList<>();

    @RequestMapping("")
    public String index(UserForm user,Model model){

        model.addAttribute("name",user.getName());
        model.addAttribute("messages",user.getNewMessage());
        model.addAttribute("newMessage", "");

        return"ex16";
    }

    @PostMapping("/submit")
    public String postMessage(String newMessage, Model model) {
        if (newMessage != null && !newMessage.trim().isEmpty()) {
            messages.add(newMessage);
        }
        return "chat";
    }
}
