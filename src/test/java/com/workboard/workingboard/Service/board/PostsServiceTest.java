package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.repository.board.BoardRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostsServiceTest {

    @Autowired
    BoardService postsService;
    @Autowired
    BoardRepository postsRepository;

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