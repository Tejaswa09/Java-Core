package com.xworkz.customerapp;

import com.xworkz.customerapp.bankAccount.BankAccount;
import com.xworkz.customerapp.customer.Customer;

public class CostomerRunner {

    public static void main(String[] args) {

        String[] branches = {"rajaji nagara", "bengluru", "hosanagara"};
        BankAccount[] bankAccounts = new BankAccount[1];

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountId = 101;
        bankAccount1.balance = 5000.75;
        bankAccount1.branches = branches;

        bankAccounts[0] = bankAccount1;

        Customer customer = new Customer();
        customer.customerId = 1;
        customer.customerName = "Tejaswa";
        customer.bankAccounts = bankAccounts;

        customer.showCustomerDetails();
    }
}


