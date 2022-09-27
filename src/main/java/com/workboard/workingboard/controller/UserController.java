package com.workboard.workingboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/auth/user/save")
    public String userSave() {
        return "user/user-save";
    }

    @GetMapping("/user/update")
    public String userUpdate() {
        return "user/user-update";
    }
}
