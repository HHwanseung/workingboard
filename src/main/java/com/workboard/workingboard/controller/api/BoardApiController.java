package com.workboard.workingboard.controller.api;

import com.workboard.workingboard.Service.board.BoardService;
import com.workboard.workingboard.config.auth.PrincipalDetail;
import com.workboard.workingboard.dto.board.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;

    /**
     * 글작성 API
     */
    @PostMapping("/api/v1/board")
    public Long save(@RequestBody BoardSaveRequestDto boardSaveRequestDto, @AuthenticationPrincipal PrincipalDetail principalDetail) {
        return boardService.save(boardSaveRequestDto,principalDetail.getUser());
    }

    /**
     * 글삭제 API
     */

    @DeleteMapping("/api/va/board/{id}")
    public Long deleteById(@PathVariable Long id) {
        boardService.deleteById(id);
        return id;
    }
}
