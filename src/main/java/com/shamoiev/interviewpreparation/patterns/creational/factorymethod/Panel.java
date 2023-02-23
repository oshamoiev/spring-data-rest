package com.shamoiev.interviewpreparation.patterns.creational.factorymethod;

import com.shamoiev.interviewpreparation.patterns.creational.factorymethod.variants.Button;

public abstract class Panel {

    /* Factory method */
    abstract Button createButton();

    void renderPanel(){
        Button button = createButton();
        button.render();
    }
}
