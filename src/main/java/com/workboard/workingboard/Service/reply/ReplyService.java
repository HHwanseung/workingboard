package com.workboard.workingboard.Service.reply;

import com.workboard.workingboard.damin.reply.Reply;
import com.workboard.workingboard.damin.user.user.User;

public interface ReplyService {

    void replySave(Long board_id, Reply reply, User user);

    void replyDelete(Long reply_id);

}
