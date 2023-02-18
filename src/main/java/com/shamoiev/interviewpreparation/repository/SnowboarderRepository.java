package com.shamoiev.interviewpreparation.repository;

import com.shamoiev.interviewpreparation.entity.Snowboarder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SnowboarderRepository extends JpaRepository<Snowboarder, Long> {
    Optional<Snowboarder> findByPhoneNumber(String phoneNumber);
}
