package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants;

import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Paint Windows Checkbox");
    }
}
