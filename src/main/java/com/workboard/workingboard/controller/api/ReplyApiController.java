package com.workboard.workingboard.controller.api;

import com.workboard.workingboard.Service.reply.ReplyService;
import com.workboard.workingboard.config.auth.PrincipalDetail;
import com.workboard.workingboard.damin.reply.Reply;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ReplyApiController {

    private final ReplyService replyService;

    @PostMapping("/api/v1/board/{board_id}/reply")
    public void save(@PathVariable Long board_id,
                     @RequestBody Reply reply,
                     @AuthenticationPrincipal PrincipalDetail principalDetail) {
        replyService.replySave(board_id, reply, principalDetail.getUser());
    }

    @DeleteMapping("/api/v1/board/{board_id}/reply/{reply_id}")
    public void delete(@PathVariable Long reply_id) {
        replyService.replyDelete(reply_id);
    }

}
