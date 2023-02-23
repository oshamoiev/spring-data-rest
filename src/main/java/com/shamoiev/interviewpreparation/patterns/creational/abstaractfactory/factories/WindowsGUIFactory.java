package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories;

import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.Button;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.CheckBox;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.WindowsButton;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
