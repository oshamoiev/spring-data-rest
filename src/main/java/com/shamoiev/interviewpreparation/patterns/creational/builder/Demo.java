package com.shamoiev.interviewpreparation.patterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder("amd", "16gb")
                .addWiFi("tp-link").addHdd("100gb").addBlueTooth("TP-Link bluetooth").build();
        System.out.println(computer);
    }
}
