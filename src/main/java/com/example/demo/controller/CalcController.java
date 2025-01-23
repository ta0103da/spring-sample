package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("requestCalc")
public class CalcController {


    @RequestMapping
    public String index(){
        return "calc";
    }

    @RequestMapping("input")
    public String input(String num1,String num2,String num3,String num4,String num5,String num6,String num7,String num8,Model model){
        model.addAttribute("index1",num1);
        
        model.addAttribute("index2",num2);
        
        model.addAttribute("index12", Integer.parseInt(num1) + Integer.parseInt(num2));

        model.addAttribute("index3",num3);
        
        model.addAttribute("index4",num4);
        
        model.addAttribute("index34", Integer.parseInt(num3) - Integer.parseInt(num4));

        model.addAttribute("index5",num5);
        
        model.addAttribute("index6",num6);
        
        model.addAttribute("index56", Integer.parseInt(num5) * Integer.parseInt(num6));

        model.addAttribute("index7",num7);
        
        model.addAttribute("index8",num8);
        
        model.addAttribute("index78", Integer.parseInt(num7) / Integer.parseInt(num8));
        return "result-calc";
    }
}
