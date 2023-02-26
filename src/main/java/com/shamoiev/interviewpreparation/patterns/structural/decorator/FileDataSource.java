package com.shamoiev.interviewpreparation.patterns.structural.decorator;

import java.io.*;

public class FileDataSource implements DataSource {
    private final String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(fileName);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }

    @Override
    public void writeData(String data) {
        File file = new File(fileName);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
