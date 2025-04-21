package com.xworkz.polymorphism.account;

public class Account {
    public void accountType() {
        System.out.println("Account Type: Generic Account");
    }

    public void accountHolder() {
        System.out.println("Account Holder: Varies based on account type.");
    }

    public void balance() {
        System.out.println("Balance: Varies based on the account.");
    }

    public void interestRate() {
        System.out.println("Interest Rate: Varies based on account type.");
    }

    public void withdraw() {
        System.out.println("Withdraw: Withdrawals can be made as per the account terms.");
    }
}
