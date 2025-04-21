package com.xworkz.polymorphism.company;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Startup startup = new Startup();
        startup.name();
        startup.industry();
        startup.employees();
        startup.revenue();
        startup.focusArea();
        System.out.println();

        System.out.println("Parent Details:");
        Company company = new Company();
        company.name();
        company.industry();
        company.employees();
        company.revenue();
        company.focusArea();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Company startupAsCompany = new Startup();
        startupAsCompany.name();
        startupAsCompany.industry();
        startupAsCompany.employees();
        startupAsCompany.revenue();
        startupAsCompany.focusArea();
    }
}
