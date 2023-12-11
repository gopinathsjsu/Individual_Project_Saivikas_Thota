package com.vikas.creditcard;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardFactoryTest {

    @Test
    public void test_DiscoverCard() {
        CreditCardFactorySelector f = new CreditCardFactorySelector();
        CreditCard card = f.getCreditCard("6011111100007756").createCreditCard();
        assertTrue(card instanceof DiscoverCC);
        assertEquals("Discover", card.toString());
    }

    @Test
    public void test_VisaCC() {
        CreditCardFactorySelector f = new CreditCardFactorySelector();
        CreditCard card = f.getCreditCard("4123456789123").createCreditCard();
        assertTrue(card instanceof VisaCC);
        assertEquals("Visa", card.toString());
    }

    @Test
    public void test_AmExCC() {
        CreditCardFactorySelector f = new CreditCardFactorySelector();
        CreditCard card = f.getCreditCard("347856341908126").createCreditCard();
        assertTrue(card instanceof AmExCC);
        assertEquals("AmericanExpress", card.toString());
    }

    @Test
    public void test_MasterCC() {
        CreditCardFactorySelector f = new CreditCardFactorySelector();
        CreditCard card = f.getCreditCard("5367894523129089").createCreditCard();
        assertTrue(card instanceof MasterCC);
        assertEquals("MasterCard", card.toString());

    }

    @Test
    public void test_invalidCreditCardNumber() {
        CreditCardFactorySelector f = new CreditCardFactorySelector();
        assertThrows(UnsupportedOperationException.class, () -> f.getCreditCard("000").createCreditCard());
    }

}
