package com.workboard.workingboard.damin.board;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.workboard.workingboard.damin.BaseTimeEntity;
import com.workboard.workingboard.damin.reply.Reply;
import com.workboard.workingboard.damin.user.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Lob
    private String content;

    private int view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    //게시글 삭제시 모든 댓글 삭제
    @OrderBy("id desc")
    @JsonIgnoreProperties({"board"})
    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reply> replyList = new ArrayList<>();






    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }


//    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    private List<Reply> replyList = new ArrayList<>();

}
