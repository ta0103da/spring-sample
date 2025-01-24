package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("login-ensyu")
public class LoginEnsyuController {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "login-ensyu-form";
    }

    @RequestMapping("/login-site")
    public String loginSite(String mail, String pass) {

        if (pass.equals("123")) {
            session.setAttribute("mail", mail);
            session.setAttribute("pass", pass);
            return "result-login-ok-page";
        }
        return "login-ensyu-form";
    }

    // @RequestMapping("/to-login-page")
    // public String toPage1() {
    //     return "result-login-ok-page";
    // }

    @RequestMapping("/to-login-myPage")
    public String toMyPage() {
        return "result-login-myPage";
    }
}
