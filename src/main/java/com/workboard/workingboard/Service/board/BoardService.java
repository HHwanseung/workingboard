package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;

public interface BoardService {

    Long save(BoardSaveRequestDto boardSaveRequestDto, User user);


}
