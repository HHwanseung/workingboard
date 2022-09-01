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

}
