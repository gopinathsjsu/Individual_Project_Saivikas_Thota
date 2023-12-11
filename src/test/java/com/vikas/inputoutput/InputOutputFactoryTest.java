package com.vikas.inputoutput;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class InputOutputFactoryTest {

    @Test
    public void test_CSV() {
        InputOutputFactorySelector f = new InputOutputFactorySelector();
        assert (f.getRecordIO("file.csv").createInputOutput() instanceof CsvInputOutput);
    }

    @Test
    public void test_XML() {
        InputOutputFactorySelector f = new InputOutputFactorySelector();
        assert (f.getRecordIO("file.xml").createInputOutput() instanceof XmlInputOutput);
    }

    @Test
    public void test_JSON() {
        InputOutputFactorySelector f = new InputOutputFactorySelector();
        assert (f.getRecordIO("file.json").createInputOutput() instanceof JsonInputOutput);
    }

    @Test
    public void test_unsupported() {
        InputOutputFactorySelector f = new InputOutputFactorySelector();
        assertThrows(UnsupportedOperationException.class, () -> f.getRecordIO("file.proto"));
    }

}

