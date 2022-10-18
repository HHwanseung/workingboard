package com.workboard.workingboard.dto.board;

import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardSaveRequestDto {

    private String title;
    private String content;
    private int view;
    private User user;

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .content(content)
                .view(0)
                .user(user)
                .build();
    }

    public void setUser(User user) {
        this.user = user;
    }

}
