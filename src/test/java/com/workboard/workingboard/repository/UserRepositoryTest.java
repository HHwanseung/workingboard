package com.workboard.workingboard.repository;

import com.workboard.workingboard.damin.Role;
import com.workboard.workingboard.damin.User;
import com.workboard.workingboard.repository.user.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    @Autowired EntityManager em;

    @AfterEach
    public void clear() {
        userRepository.deleteAll();
    }
    
    @Test
    public void 회원저장() throws Exception {
        //given
        User user = User.builder()
                .username("username")
                .password("123")
                .nickname("nickname")
                .email("asd@nate.com")
                .role(Role.USER)
                .build();

        //when
        User saveUser = userRepository.save(user);
        
        //then
        User findUser = userRepository.findById(saveUser.getId()).orElseThrow(() -> new RuntimeException("저장된 회원이 없습니다."));

        assertThat(findUser).isSameAs(saveUser);
        assertThat(findUser).isSameAs(user);

    }



}