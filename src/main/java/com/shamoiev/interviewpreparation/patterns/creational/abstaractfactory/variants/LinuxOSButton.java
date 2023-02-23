package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants;

public class LinuxOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint Linux button");
    }
}
