package com.example.test_spring_scope_takigawa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_takigawa.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam-bonus")
public class ExamBonusController {

    @Autowired
    public HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam-bonus-input";
    }

    @RequestMapping("/login")
    public String login(String email, String pass, Model model) {
        if ("yamada@sample.com".equals(email) && "yamayama".equals(pass)) {
            User user = new User();
            user.setName("山田太郎");
            user.setEmail("yamada@sample.com");
            user.setAge(18);
            session.setAttribute("user", user);
            return "exam-bonus-result";
        } else {
            model.addAttribute("error", "ログインに失敗しました");
            return "exam-bonus-input";
        }
    }
}
