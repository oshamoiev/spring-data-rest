package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Paint Linux CheckBox");
    }
}
