package com.vikas.inputoutput;

import com.vikas.creditcard.CreditCard;

import java.util.List;

import java.util.List;

public interface InputOutput {
    List<CreditCard> readFile(String filename);

    boolean writeFile(String filename, List<CreditCard> records);
}