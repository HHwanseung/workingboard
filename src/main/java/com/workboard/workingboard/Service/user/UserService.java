package com.workboard.workingboard.Service.user;

import com.workboard.workingboard.config.auth.PrincipalDetail;
import com.workboard.workingboard.damin.User;
import com.workboard.workingboard.dto.user.UserDto;
import com.workboard.workingboard.dto.user.UserSaveRequestDto;

public interface UserService {

    Long save(User user) throws Exception;

    Long update(User user, PrincipalDetail principalDetail);

    void remove(Long id);



}
