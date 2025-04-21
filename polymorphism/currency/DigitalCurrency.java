package com.xworkz.polymorphism.currency;

public class DigitalCurrency extends Currency {
    @Override
    public void name() {
        System.out.println("Name: Bitcoin");
    }

    @Override
    public void type() {
        System.out.println("Type: Digital currency (Cryptocurrency)");
    }

    @Override
    public void transactionMode() {
        System.out.println("Transaction Mode: Peer-to-peer via Blockchain");
    }

    @Override
    public void security() {
        System.out.println("Security: Cryptographic encryption and blockchain");
    }

    @Override
    public void value() {
        System.out.println("Value: Highly volatile, based on market demand");
    }
}
