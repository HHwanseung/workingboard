package com.workboard.workingboard.Service.post;

import com.workboard.workingboard.dto.posts.PostsDto;

public interface PostsService {

    void write(PostsDto postsDto) throws Exception;

    void update(Long id, PostsDto postsDto) throws  Exception;

    void delete(Long id);





}
