package com.batta.controller;

import com.batta.service.User_Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@AllArgsConstructor
@Controller
@RequestMapping("/user")
public class User_controller {
    User_Service user_service;


    @GetMapping("/signup")
    @ResponseBody
    public String signup() {
        System.err.println(user_service);
        return "signup";
    }
}
