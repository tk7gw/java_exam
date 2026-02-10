package com.example.test_spring_scope_takigawa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class exam01Controller {

    @RequestMapping("")
    public String index(){
        return "exam01";
    }

    @RequestMapping("/receive-info")
    public String receiveInfo(String email, String pass, Model model) {
        if ("yamada@sample.com".equals(email) && "yamayama".equals(pass)) {
            model.addAttribute("result", "成功");
        } else {
            model.addAttribute("result", "失敗");
        }
        return "exam01-result";
    }

}
