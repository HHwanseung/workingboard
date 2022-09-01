package com.workboard.workingboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/save")
    public String userSave() {
        return "user/user-save";
    }
}
