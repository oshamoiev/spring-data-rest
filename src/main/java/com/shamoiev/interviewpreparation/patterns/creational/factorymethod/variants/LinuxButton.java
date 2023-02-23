package com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Linux button");
    }
}
