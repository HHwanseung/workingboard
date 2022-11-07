package com.workboard.workingboard.damin.user.user;

import com.workboard.workingboard.damin.BaseTimeEntity;
import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.reply.Reply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //sequence, auto_increment

    @Column(nullable = false,length = 50, unique = true)
    private String username; // 아이디

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 20)
    private String nickname;

    @Column(nullable = false, length = 50)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    //Oauth
    @Column
    private String provider;

    @Column
    private String providerId;

    //회원탈퇴시 게시물, 댓글 삭제
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Board> boardList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reply> replyList = new ArrayList<>();







    /**
     * 비밀번호 암호화 메소드
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 권한 메소드
     */
    public String getRoleKey() {
        return this.getRoleKey();
    }

    /**
     * 회원수정 메소드
     */
    public void update(String password, String nickname) {
        this.password = password;
        this.nickname = nickname;

    }

    public void setEmail(String email) {
        this.email = email;
    }

}
