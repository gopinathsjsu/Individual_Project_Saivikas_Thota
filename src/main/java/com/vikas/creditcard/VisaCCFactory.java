package com.vikas.creditcard;

public class VisaCCFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard() {
        // TODO Auto-generated method stub
        return new VisaCC();
    }
    
}
