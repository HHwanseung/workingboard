package com.workboard.workingboard.Service.post;

import com.workboard.workingboard.damin.Posts;
import com.workboard.workingboard.dto.posts.PostsDto;
import com.workboard.workingboard.repository.posts.PostsRepository;
import com.workboard.workingboard.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PostsServiceImpl implements PostsService {

    private final PostsRepository postsRepository;
    private final UserRepository userRepository;

    @Override
    public void write(PostsDto postsDto) {
        Posts posts = postsDto.toEntity();
        postsRepository.save(posts);
    }

    @Override
    public void update(Long id, PostsDto postsDto) {

    }

    @Override
    public void delete (Long id) {

    }

}
