package com.xworkz.polymorphism.ecommerce;

public class EcommerceRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Swiggy swiggy = new Swiggy();
        swiggy.platformName();
        swiggy.serviceType();
        swiggy.deliveryTime();
        swiggy.paymentModes();
        swiggy.customerSupport();
        System.out.println();

        System.out.println("Parent Details:");
        Ecommerce ecommerce = new Ecommerce();
        ecommerce.platformName();
        ecommerce.serviceType();
        ecommerce.deliveryTime();
        ecommerce.paymentModes();
        ecommerce.customerSupport();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Ecommerce swiggyAsEcommerce = new Swiggy();
        swiggyAsEcommerce.platformName();
        swiggyAsEcommerce.serviceType();
        swiggyAsEcommerce.deliveryTime();
        swiggyAsEcommerce.paymentModes();
        swiggyAsEcommerce.customerSupport();
    }
}
