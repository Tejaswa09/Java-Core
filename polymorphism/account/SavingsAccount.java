package com.xworkz.polymorphism.account;

public class SavingsAccount extends Account {
    @Override
    public void accountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void accountHolder() {
        System.out.println("Account Holder: Individual or joint account holders.");
    }

    @Override
    public void balance() {
        System.out.println("Balance: Minimum balance required may vary by bank.");
    }

    @Override
    public void interestRate() {
        System.out.println("Interest Rate: Typically 3% to 4% per annum.");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw: Limited withdrawal per month to avoid penalties.");
    }
}
