package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory;

import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories.GUIFactory;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.Button;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.variants.CheckBox;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
