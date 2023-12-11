package com.vikas.creditcard;

public class DiscoverCCFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard() {
        // TODO Auto-generated method stub
        return new DiscoverCC();
    }
    
}
