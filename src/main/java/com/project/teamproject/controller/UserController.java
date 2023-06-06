package com.project.teamproject.controller;

import com.project.teamproject.createForm.UserCreateForm;
import com.project.teamproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login/error")
    public String loginError() {
        System.out.println("?????LOGIN@@ ERROR???????????");
        return "error";
    }

    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm){
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "signup";
        }

        try{
            userService.create(userCreateForm.getId(),userCreateForm.getPw(),userCreateForm.getName());
        } catch (DataIntegrityViolationException e){
            e.printStackTrace();
            bindingResult.reject("signupFailed","This user is already existed");
            return "signup";
        } catch (Exception e){
            e.printStackTrace();
            bindingResult.reject("signupFailed",e.getMessage());
            return "signup";
        }

        return "redirect:/user/login";
    }
}