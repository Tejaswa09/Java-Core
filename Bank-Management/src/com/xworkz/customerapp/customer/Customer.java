package com.xworkz.customerapp.customer;

import com.xworkz.customerapp.bankAccount.BankAccount;

public class Customer {

    public int customerId;
    public String customerName;
    public BankAccount[] bankAccounts;

    public void showCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank Accounts: ");
        for (BankAccount bankAccount : bankAccounts) {
            bankAccount.showBankAccountDetails();
        }
    }
}

