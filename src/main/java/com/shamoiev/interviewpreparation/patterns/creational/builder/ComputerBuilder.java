package com.shamoiev.interviewpreparation.patterns.creational.builder;

public class ComputerBuilder {
    /* Required */
    private final String cpu;
    private final String ram;

    /* Optional */
    private String hdd;
    private String bluetooth;
    private String wifi;

    public ComputerBuilder(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public ComputerBuilder addHdd(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder addBlueTooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public ComputerBuilder addWiFi(String wifi) {
        this.wifi = wifi;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, ram, hdd, bluetooth, wifi);
    }
}
