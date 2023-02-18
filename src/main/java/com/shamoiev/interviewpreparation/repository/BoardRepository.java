package com.shamoiev.interviewpreparation.repository;

import com.shamoiev.interviewpreparation.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllBySnowboarderId(Long id);
}
