package com.workboard.workingboard.Service.board;

import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;
import com.workboard.workingboard.dto.board.BoardUpdateRequestDto;
import com.workboard.workingboard.repository.board.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public void deleteById(Long id) {
        boardRepository.deleteById(id);
    }

    @Override
    public Long update(Long id, BoardUpdateRequestDto boardUpdateRequestDto) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new IllegalStateException("해당 Id가 없습니다. id=" + id));
        board.update(boardUpdateRequestDto.getTitle(), boardUpdateRequestDto.getContent());
        return id;
    }

    @Override
    public Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable) {
        return boardRepository.findByTitleContainingOrContentContaining(title, content, pageable);
    }

    @Override
    public void updateView(Long id) {

    }

}
