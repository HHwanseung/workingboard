package com.workboard.workingboard.api;

import com.workboard.workingboard.Service.user.UserService;
import com.workboard.workingboard.config.auth.PrincipalDetail;
import com.workboard.workingboard.damin.User;
import com.workboard.workingboard.dto.user.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/auth/api/v1/user")
    public Long save(@RequestBody @Valid UserSaveRequestDto userSaveRequestDto) throws Exception {
        return userService.save(userSaveRequestDto.toEntity());
    }

    /**
     * 회원수정 API
     */

    @PutMapping("/api/v1/user")
    public Long update(@RequestBody User user, @AuthenticationPrincipal PrincipalDetail principalDetail) {
        userService.update(user, principalDetail);
        return user.getId();
    }

}
