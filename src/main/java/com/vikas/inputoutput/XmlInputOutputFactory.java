package com.vikas.inputoutput;

public class XmlInputOutputFactory implements InputOutputFactory{

    @Override
    public InputOutput createInputOutput() {
        // TODO Auto-generated method stub
        return new XmlInputOutput();
    }
    
}
