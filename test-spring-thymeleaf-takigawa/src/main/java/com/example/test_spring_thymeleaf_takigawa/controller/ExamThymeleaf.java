package com.example.test_spring_thymeleaf_takigawa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_takigawa.domain.Member;

@Controller
@RequestMapping("ex")
public class ExamThymeleaf {

    @RequestMapping("/input")
    public String input() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(String name, Integer age, List<String> hobbyList, Model model) {

        Member member = new Member();
        member.setName(name);
        member.setAge(age);
        member.setHobbyList(hobbyList);

        model.addAttribute("member", member);

        return "ex-thymeleaf-result";
    }
}
