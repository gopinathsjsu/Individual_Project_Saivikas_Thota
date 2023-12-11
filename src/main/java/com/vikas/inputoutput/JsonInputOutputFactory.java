package com.vikas.inputoutput;

public class JsonInputOutputFactory implements InputOutputFactory{
    @Override
    public InputOutput createInputOutput() {
        // TODO Auto-generated method stub
        return new JsonInputOutput();
    }
}
