package com.shamoiev.interviewpreparation.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {
    @Bean
    public SnowboarderBeforeSaveEventListener snowboarderBeforeSaveEventListener() {
        return new SnowboarderBeforeSaveEventListener();
    }

    @Bean
    public SnowboarderEventHandler snowboarderEventHandler() {
        return new SnowboarderEventHandler();
    }
}
