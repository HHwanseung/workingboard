package com.workboard.workingboard.Service.user;

import com.workboard.workingboard.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired EntityManager em;
    @Autowired UserRepository userRepository;
    @Autowired UserService userService;






}