package com.workboard.workingboard.repository.posts;

import com.workboard.workingboard.damin.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

//    Posts findByNickname (String nickname);

}
