package com.workboard.workingboard.dto.posts;

import com.workboard.workingboard.damin.Posts;
import com.workboard.workingboard.damin.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostsDto {

    private Long id;
    private String title;
    private String writer;
    private String content;
    private String createdDate, modifiedDate;
    private int view;
    private User user;

    public PostsDto(Long id, String title, String writer, String content, String createdDate, String modifiedDate, int view, User user) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.view = view;
        this.user = user;
    }

    public Posts toEntity() {
        return Posts.builder()
                .id(id)
                .title(title)
                .writer(writer)
                .content(content)
                .view(view)
                .user(user)
                .build();

    }


}
