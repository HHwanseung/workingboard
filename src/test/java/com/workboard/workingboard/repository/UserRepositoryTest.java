package com.workboard.workingboard.repository;

import com.workboard.workingboard.damin.user.user.Role;
import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.repository.user.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired UserRepository userRepository;
    @Autowired EntityManager em;

    @AfterEach
    public void clear() {
        userRepository.deleteAll();
    }
    
    @Test
    public void 회원저장() throws Exception {
        //given
        String username = "test";
        String nickname = "babo";

        userRepository.save(User.builder()
                .username(username)
                .password("1234")
                .email("test@naver.com")
                .nickname(nickname)
                .role(Role.USER)
                .build());

        //when
        List<User> userList = userRepository.findAll();

        //then
        User user = userList.get(0);
        assertThat(user.getUsername()).isEqualTo(username);
        assertThat(user.getNickname()).isEqualTo(nickname);
    }



}