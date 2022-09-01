package com.workboard.workingboard.Service.user;


import com.workboard.workingboard.damin.User;
import com.workboard.workingboard.dto.user.UserDto;
import com.workboard.workingboard.dto.user.UserSaveRequestDto;
import com.workboard.workingboard.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public void userJoin(UserSaveRequestDto userSaveRequestDto) {
        User user = userSaveRequestDto.toEntity();
        userRepository.save(user).getId();

    }

    @Override
    public void modify(UserDto userDto) {
//        User user =

    }

    @Override
    public void remove(Long id) {

    }



}
