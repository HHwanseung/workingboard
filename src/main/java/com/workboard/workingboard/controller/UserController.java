package com.workboard.workingboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/auth/user/save")
    public String userSave() {
        return "user/user-save";
    }

    @GetMapping("/auth/user/login")
    public String userLogin() {
        return "user/user-login";
    }

    @GetMapping("/user/update")
    public String userUpdate() {
        return "user/user-update";
    }
}
