package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint Windows button");
    }
}
