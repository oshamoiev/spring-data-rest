package com.shamoiev.interviewpreparation.service;


import com.shamoiev.interviewpreparation.entity.Snowboarder;
import com.shamoiev.interviewpreparation.repository.SnowboarderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SnowboarderService {

    private final SnowboarderRepository snowBoarderRepository;

    public SnowboarderService(SnowboarderRepository snowBoarderRepository) {
        this.snowBoarderRepository = snowBoarderRepository;
    }

    public List<Snowboarder> getAll() {
        return snowBoarderRepository.findAll();
    }

    public Snowboarder createSnowBoarder(Snowboarder snowboarder) {
        return snowBoarderRepository.save(snowboarder);
    }

    public Snowboarder getSnowBoarder(String phoneNumber) {
        return snowBoarderRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.CONFLICT));
    }
}
