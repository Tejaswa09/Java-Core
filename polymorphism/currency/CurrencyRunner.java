package com.xworkz.polymorphism.currency;

public class CurrencyRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        DigitalCurrency digitalCurrency = new DigitalCurrency();
        digitalCurrency.name();
        digitalCurrency.type();
        digitalCurrency.transactionMode();
        digitalCurrency.security();
        digitalCurrency.value();
        System.out.println();

        System.out.println("Parent Details:");
        Currency currency = new Currency();
        currency.name();
        currency.type();
        currency.transactionMode();
        currency.security();
        currency.value();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Currency digitalCurrencyAsCurrency = new DigitalCurrency();
        digitalCurrencyAsCurrency.name();
        digitalCurrencyAsCurrency.type();
        digitalCurrencyAsCurrency.transactionMode();
        digitalCurrencyAsCurrency.security();
        digitalCurrencyAsCurrency.value();
    }
}
