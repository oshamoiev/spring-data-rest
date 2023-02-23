package com.shamoiev.interviewpreparation.patterns.creational.factorymethod;

public class Demo {
    public static void main(String[] args) {
        Panel panel = configure();
        panel.renderPanel();
    }
    static Panel configure() {
        Panel panel;
        if (System.getProperty("os.name").equalsIgnoreCase("linux")) {
            panel = new LinuxPanel();
        } else {
            panel = new WindowsPanel();
        }

        return panel;
    }
}
