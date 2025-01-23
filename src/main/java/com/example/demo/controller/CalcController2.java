package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.CalcForm;

@Controller
@RequestMapping("/requestCalc2")
public class CalcController2 {


    @RequestMapping
    public String index(){
        return "calc2";
    }

    @RequestMapping("/input")
    public String input(@ModelAttribute("calc")CalcForm calc,Model model){
        System.out.println(calc.toString());
        System.out.println(String.valueOf(Integer.parseInt(calc.getNum1()) + Integer.parseInt(calc.getNum2())));
        calc.setNumSum(String.valueOf((Integer.parseInt(calc.getNum1()) + Integer.parseInt(calc.getNum2()))));
        calc.setNumSub(String.valueOf((Integer.parseInt(calc.getNum3()) - Integer.parseInt(calc.getNum4()))));
        calc.setNumMul(String.valueOf((Integer.parseInt(calc.getNum5()) * Integer.parseInt(calc.getNum6()))));
        calc.setNumDiv(String.valueOf((Integer.parseInt(calc.getNum7()) / Integer.parseInt(calc.getNum8()))));
        System.out.println(calc.toString());
        return "result-calc2";
    }
}

