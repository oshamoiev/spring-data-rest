package com.shamoiev.interviewpreparation.patterns.structural.decorator;

import java.io.FileNotFoundException;

public interface DataSource {
    String readData();

    void writeData(String data);
}
