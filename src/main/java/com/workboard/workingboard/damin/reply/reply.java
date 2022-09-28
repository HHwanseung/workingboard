package com.workboard.workingboard.damin.reply;

import com.workboard.workingboard.damin.BaseTimeEntity;
import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "comments")
public class reply extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Board posts;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
