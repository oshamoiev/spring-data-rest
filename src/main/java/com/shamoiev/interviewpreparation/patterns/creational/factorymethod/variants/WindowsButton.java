package com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows button");
    }
}
