package com.workboard.workingboard.Service.reply;

import com.workboard.workingboard.damin.board.Board;
import com.workboard.workingboard.damin.reply.Reply;
import com.workboard.workingboard.damin.user.user.User;
import com.workboard.workingboard.repository.board.BoardRepository;
import com.workboard.workingboard.repository.reply.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ReplyServiceImpl implements ReplyService {

    private final BoardRepository boardRepository;
    private final ReplyRepository replyRepository;

    @Override
    public void replySave(Long board_id, Reply reply, User user) {

        Board board = boardRepository.findById(board_id).orElseThrow(() -> new IllegalArgumentException("해당 boardId가 없습니다. id=" + board_id));

        reply.save(board, user);

        replyRepository.save(reply);

    }

    @Override
    public void replyDelete(Long reply_id) {

        replyRepository.deleteById(reply_id);

    }
}
