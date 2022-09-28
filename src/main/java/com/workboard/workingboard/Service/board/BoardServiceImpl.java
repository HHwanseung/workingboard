package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;
import com.workboard.workingboard.repository.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Long save(BoardSaveRequestDto boardSaveRequestDto, User user) {
        boardSaveRequestDto.setUser(user);
        return boardRepository.save(boardSaveRequestDto.toEntity()).getId();
    }

}
