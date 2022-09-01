package com.workboard.workingboard.Service.user;

import com.workboard.workingboard.damin.User;
import com.workboard.workingboard.dto.user.UserDto;
import com.workboard.workingboard.dto.user.UserSaveRequestDto;

public interface UserService {

    void userJoin(UserSaveRequestDto userSaveRequestDto) throws Exception;

    void modify(UserDto userDto) throws Exception;

    void remove(Long id);


}
