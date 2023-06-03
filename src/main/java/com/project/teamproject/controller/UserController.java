package com.project.teamproject.controller;

import com.project.teamproject.domain.entity.UserEntity;
import com.project.teamproject.service.UserService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "signup";
        }
        try{
            userService.create(userCreateForm.getId(), userCreateForm.getPw(), userCreateForm.getName(), userCreateForm.isLocation());
        }catch (DataIntegrityViolationException e){
            e.printStackTrace();
            bindingResult.reject("signup Failed", "이미 등록된 사용자입니다.");
            return "signup";
        }catch (Exception e){
            e.printStackTrace();
            bindingResult.reject("signup Failed", e.getMessage());
            return "signup";
        }
        return "redirect:/login";
    }
}