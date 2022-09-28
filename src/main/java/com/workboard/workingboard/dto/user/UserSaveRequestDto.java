package com.workboard.workingboard.dto.user;

import com.workboard.workingboard.damin.user.user.Role;
import com.workboard.workingboard.damin.user.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    @NotEmpty
    private String username; // 아이디

    private String password;
    private String nickname;
    private String email;
    private Role role;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .nickname(nickname)
                .email(email)
                .role(role.USER)
                .build();
    }
}
