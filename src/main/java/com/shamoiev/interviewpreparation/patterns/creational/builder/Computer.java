package com.shamoiev.interviewpreparation.patterns.creational.builder;

public class Computer {
    /* Required */
    final String cpu;
    final String ram;

    /* Optional */
    final String hdd;
    final String bluetooth;
    final String wifi;

    public Computer(String cpu, String ram, String hdd, String bluetooth, String wifi) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", Ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", wifi='" + wifi + '\'' +
                '}';
    }
}
