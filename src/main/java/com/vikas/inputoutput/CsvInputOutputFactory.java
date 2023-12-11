package com.vikas.inputoutput;

public class CsvInputOutputFactory implements InputOutputFactory{

    @Override
    public InputOutput createInputOutput() {
        // TODO Auto-generated method stub
        return new CsvInputOutput();
    }
   
}
