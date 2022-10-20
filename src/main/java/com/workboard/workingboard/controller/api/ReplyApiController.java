package com.workboard.workingboard.controller.api;

import com.workboard.workingboard.Service.reply.ReplyService;
import com.workboard.workingboard.config.auth.PrincipalDetail;
import com.workboard.workingboard.damin.reply.Reply;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ReplyApiController {

    private final ReplyService replyService;

    @PostMapping("/api/v1/board/{boardId}/reply")
    public void save(@PathVariable Long boardId,
                     @RequestBody Reply reply,
                     @AuthenticationPrincipal PrincipalDetail principalDetail) {
        replyService.replySave(boardId, reply, principalDetail.getUser());
    }

}
