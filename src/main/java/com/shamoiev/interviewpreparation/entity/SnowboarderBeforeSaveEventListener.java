package com.shamoiev.interviewpreparation.entity;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;

public class SnowboarderBeforeSaveEventListener extends AbstractRepositoryEventListener<Snowboarder> {
    @Override
    protected void onBeforeSave(Snowboarder snowboarder) {
        super.onBeforeSave(snowboarder);
    }

    @Override
    protected void onAfterCreate(Snowboarder entity) {
        super.onAfterCreate(entity);
        System.out.println(entity.getName());
    }
}
