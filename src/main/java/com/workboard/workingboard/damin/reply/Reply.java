package com.workboard.workingboard.damin.reply;

import com.workboard.workingboard.damin.BaseTimeEntity;
import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Reply extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Reply parent;

    private boolean isRemoved= false;

    //부모 댓글을 삭제해도 자식 댓글은 살아있음
    @OneToMany(mappedBy = "parent")
    private List<Reply> chileList = new ArrayList<>();




    public void save(Board board, User user) {
        this.board = board;
        this.user = user;
    }


}
