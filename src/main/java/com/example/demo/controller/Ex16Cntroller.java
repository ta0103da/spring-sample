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

    private List<UserForm> messageList = new ArrayList<>();

    @RequestMapping("")
    public String index(){
        if (messageList == null) {
            messageList = new ArrayList<>();
        }

        return"ex16";

    }

    @PostMapping("")
    public String Post(UserForm user,Model model){

        messageList.add(0, new UserForm(user.getName(),user.getMessage()));
        model.addAttribute("messageList", messageList);
        return"ex16";
    }
}
