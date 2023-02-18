package com.shamoiev.interviewpreparation.service;

import com.shamoiev.interviewpreparation.entity.Board;
import com.shamoiev.interviewpreparation.repository.BoardRepository;
import com.shamoiev.interviewpreparation.repository.SnowboarderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private final SnowboarderRepository snowboarderRepository;
    private final BoardRepository boardRepository;

    public BoardService(SnowboarderRepository snowboarderRepository, BoardRepository boardRepository) {
        this.snowboarderRepository = snowboarderRepository;
        this.boardRepository = boardRepository;
    }

    public Board createBoard(String phoneNumber, Board board) {
        return snowboarderRepository.findByPhoneNumber(phoneNumber).map(snowboarder -> {
            board.setSnowboarder(snowboarder);
            return boardRepository.save(board);
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<Board> getAllBoardsBySnowboarder(String phoneNumber) {
        return snowboarderRepository.findByPhoneNumber(phoneNumber)
                .map(snowboarder -> boardRepository.findAllBySnowboarderId(snowboarder.getId())).orElseThrow();
    }
}
