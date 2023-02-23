package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories;

import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.Button;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
