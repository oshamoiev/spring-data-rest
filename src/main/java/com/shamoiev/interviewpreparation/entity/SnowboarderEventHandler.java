package com.shamoiev.interviewpreparation.entity;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler
public class SnowboarderEventHandler {

    @HandleBeforeSave
    public void handleSnowboarderSave(Snowboarder snowboarder) {
        snowboarder.setName(snowboarder.getName().toUpperCase());
    }

    @HandleAfterCreate
    public void handleBookBeforeCreate(Snowboarder snowboarder) {
        System.out.println(snowboarder.getName());
    }
}
