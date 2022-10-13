package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;

import java.util.List;

public interface BoardService {

    Long save(BoardSaveRequestDto boardSaveRequestDto, User user);

    List<Board> findAll();

    Board detail(Long id);





}
