package com.shamoiev.interviewpreparation.repository;

import com.shamoiev.interviewpreparation.entity.Board;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long> {
    List<Board> findAllBySnowboarderId(Long id);
}
