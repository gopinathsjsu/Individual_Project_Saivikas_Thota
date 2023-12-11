package com.vikas.creditcard;

public class AmExCCFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard() {
        // TODO Auto-generated method stub
        return new AmExCC();
    }
    
}

