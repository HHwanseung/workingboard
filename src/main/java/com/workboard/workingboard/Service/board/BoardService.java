package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;
import com.workboard.workingboard.dto.board.BoardUpdateRequestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BoardService {

    /**
     * 글작성 로직
     */
    Long save(BoardSaveRequestDto boardSaveRequestDto, User user);

    /**
     * 글목록 로직
     */
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

    /**
     * 글상세 로직
     */
    Board detail(Long id);

    /**
     * 글삭제 로직
     */
    void deleteById(Long id);

    /**
     * 글수정 로직
     */
    Long update(Long id, BoardUpdateRequestDto boardUpdateRequestDto);

    /**
     * 글 조회수 로직
     */
    void updateView(Long id);
}
