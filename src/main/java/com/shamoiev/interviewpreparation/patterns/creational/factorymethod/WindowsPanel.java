package com.shamoiev.interviewpreparation.patterns.creational.factorymethod;

import com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants.Button;
import com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants.WindowsButton;

public class WindowsPanel extends Panel {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
