package com.project.teamproject.controller;

import com.project.teamproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MainController {
    private final UserService userService;

    @GetMapping("/home")
    public String home() { return "home"; }

    @GetMapping("/chat")
    public String chat() { return "chat"; }

    @GetMapping("/pharmacy")
    public String pharmacy() { return "pharmacy"; }

    @GetMapping("/medicineBox")
    public String medicineBox() { return "medicineBox"; }
}
