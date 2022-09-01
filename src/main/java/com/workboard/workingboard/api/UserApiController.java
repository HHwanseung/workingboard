package com.workboard.workingboard.api;

import com.workboard.workingboard.Service.user.UserService;
import com.workboard.workingboard.damin.User;
import com.workboard.workingboard.dto.user.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/api/v1/user")
    public void join(@RequestBody @Valid UserSaveRequestDto userSaveRequestDto) throws Exception {
        userService.userJoin(userSaveRequestDto);
    }








}
