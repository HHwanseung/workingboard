package com.workboard.workingboard.Service.user;

import com.workboard.workingboard.config.auth.PrincipalDetail;
import com.workboard.workingboard.damin.user.user.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

public interface UserService {

    Long save(User user);

    Long update(User user, @AuthenticationPrincipal PrincipalDetail principalDetail);

//    void remove(Long id);



}
