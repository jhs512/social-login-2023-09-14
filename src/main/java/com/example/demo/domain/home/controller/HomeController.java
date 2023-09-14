package com.example.demo.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showMain(Model model, Principal principal) {
        String loginedMemberUsername = principal == null ? null : principal.getName();

        model.addAttribute("loginedMemberUsername", loginedMemberUsername);

        return "usr/home/main";
    }
}
