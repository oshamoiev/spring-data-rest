package com.shamoiev.interviewpreparation.patterns.creational.factorymethod;

import com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants.Button;
import com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants.LinuxButton;

public class LinuxPanel extends Panel {
    @Override
    Button createButton() {
        return new LinuxButton();
    }
}
