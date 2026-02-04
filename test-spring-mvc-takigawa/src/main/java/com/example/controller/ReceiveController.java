package com.example.test_spring_mvc_takigawa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_takigawa.ReceiveNameForm;

@Controller
@RequestMapping("/name")
public class ReceiveNameController {
    
    @ModelAttribute
    public ReceiveNameForm setUpForm(){
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index(){
        return "name-form";
    }

    @RequestMapping("/form")
    public String form(ReceiveNameForm recieveForm) {
        System.out.println(recieveForm.getName());
        return "finished";
    }
}
