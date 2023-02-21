package com.shamoiev.interviewpreparation.controller.api;

import com.shamoiev.interviewpreparation.entity.Board;
import com.shamoiev.interviewpreparation.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/snowboarders/{phoneNumber}/boards")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public List<Board> getAllBoardsBySnowboarder(@PathVariable String phoneNumber) {
        return boardService.getAllBoardsBySnowboarder(phoneNumber);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Board createBoard(@PathVariable String phoneNumber, @RequestBody Board board) {
        return boardService.createBoard(phoneNumber, board);
    }
}
