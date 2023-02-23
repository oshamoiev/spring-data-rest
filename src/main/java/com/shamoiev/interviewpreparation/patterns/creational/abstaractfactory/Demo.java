package com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory;

import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories.GUIFactory;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories.MacOSGUIFactory;
import com.shamoiev.interviewpreparation.patterns.creational.abstaractfactory.factories.WindowsGUIFactory;

public class Demo {
    private static Application configureApplication() {
        GUIFactory guiFactory = null;
        String osName = System.getProperty("os.name").toLowerCase();
        
        if (osName.toLowerCase().contains("windows")) {
            guiFactory = new WindowsGUIFactory();
        } else if (osName.toLowerCase().contains("linux")) {
            guiFactory = new MacOSGUIFactory();
        } else {
            System.exit(1);
        }
        
        return new Application(guiFactory);
    }

    public static void main(String[] args) {
        configureApplication().paint();
    }
}
