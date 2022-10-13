package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;
import com.workboard.workingboard.repository.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Board> findAll() {
        return boardRepository.findAll();

    }

    @Override
    public Board detail(Long id) {
        return boardRepository.findById(id).orElseThrow(() -> new IllegalStateException("해당 아이디가 없습니다 id=" + id ));
    }

}
