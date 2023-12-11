package com.vikas.inputoutput;

public class InputOutputFactorySelector {
    public InputOutputFactory getRecordIO(String filename) {
        if (filename.endsWith(".csv")) {
            return new CsvInputOutputFactory();
        } else if (filename.endsWith(".json")) {
            return new JsonInputOutputFactory();
        } else if (filename.endsWith(".xml")) {
            return new XmlInputOutputFactory();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}