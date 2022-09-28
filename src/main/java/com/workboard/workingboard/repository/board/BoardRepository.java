package com.workboard.workingboard.repository.board;

import com.workboard.workingboard.damin.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
