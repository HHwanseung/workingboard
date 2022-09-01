package com.workboard.workingboard.Service.post;

import com.workboard.workingboard.repository.posts.PostsRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostsServiceTest {

    @Autowired PostsService postsService;
    @Autowired PostsRepository postsRepository;

    @AfterEach
    public void clear() {


    }

    @Test
    public void register() throws Exception {
        //given



        //when

        //then



    }



}