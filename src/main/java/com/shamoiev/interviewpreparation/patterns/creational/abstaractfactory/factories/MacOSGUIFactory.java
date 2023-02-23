package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories;

import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.Button;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.CheckBox;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.LinuxOSButton;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.LinuxCheckBox;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
