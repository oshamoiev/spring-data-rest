package com.shamoiev.interviewpreparation.patterns.structural.decorator;

public class DataSourceDecorator implements DataSource{
    private final DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }
}
