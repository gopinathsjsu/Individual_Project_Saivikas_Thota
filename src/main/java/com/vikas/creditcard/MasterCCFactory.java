package com.vikas.creditcard;

public class MasterCCFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard() {
        // TODO Auto-generated method stub
        return new MasterCC();
    }
    
}

