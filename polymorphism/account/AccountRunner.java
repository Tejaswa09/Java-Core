package com.xworkz.polymorphism.account;

public class AccountRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountType();
        savingsAccount.accountHolder();
        savingsAccount.balance();
        savingsAccount.interestRate();
        savingsAccount.withdraw();
        System.out.println();

        System.out.println("Parent Details:");
        Account account = new Account();
        account.accountType();
        account.accountHolder();
        account.balance();
        account.interestRate();
        account.withdraw();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Account savingsAccountAsAccount = new SavingsAccount();
        savingsAccountAsAccount.accountType();
        savingsAccountAsAccount.accountHolder();
        savingsAccountAsAccount.balance();
        savingsAccountAsAccount.interestRate();
        savingsAccountAsAccount.withdraw();
    }
}
