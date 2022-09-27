package com.workboard.workingboard.dto.user;

import com.workboard.workingboard.damin.Role;
import com.workboard.workingboard.damin.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private Role role;

    public UserDto(Long id, String username, String password, String nickname, String email, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.role = role;
    }
}
