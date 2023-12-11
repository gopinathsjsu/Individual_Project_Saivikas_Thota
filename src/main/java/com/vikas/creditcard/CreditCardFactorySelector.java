package com.vikas.creditcard;

public class CreditCardFactorySelector {
    public CreditCardFactory getCreditCard(String cardNumber) {
        if(!cardNumber.matches("^[0-9]+$")) {
            throw new UnsupportedOperationException("Invalid: non numeric characters");
        } else if(cardNumber.length() > 19) {
            throw new UnsupportedOperationException("Invalid: more than 19 digits");
        } else if(cardNumber.isEmpty()) {
            throw new UnsupportedOperationException("Invalid: empty/null card number");
        
        } else if (cardNumber.length() == 16 && cardNumber.charAt(0) == '5' && cardNumber.charAt(1) >= '1' &&
                   cardNumber.charAt(1) <= '5') {
            return new MasterCCFactory();
        
        } else if ( (cardNumber.length() == 13 || cardNumber.length() == 16 ) && cardNumber.charAt(0) == '4') {
            return new VisaCCFactory();
        
        } else if (cardNumber.length() == 15 && cardNumber.charAt(0) == '3' && 
                  (cardNumber.charAt(1) == '4' || cardNumber.charAt(1) == '7')) {
            return new AmExCCFactory();
        
        } else if (cardNumber.length() == 16 && cardNumber.startsWith("6011")) {
            return new DiscoverCCFactory();
        } else {
            throw new UnsupportedOperationException("Invalid: not a possible card number");
        }
    }
}   