package com.workboard.workingboard.Service.reply;

import com.workboard.workingboard.damin.reply.Reply;
import com.workboard.workingboard.damin.user.user.User;

public interface ReplyService {

    void replySave(Long boardId, Reply reply, User user);

    void replyDelete(Long replyId);

}
