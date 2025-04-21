package com.xworkz.polymorphism.ecommerce;

public class Swiggy extends Ecommerce {
    @Override
    public void platformName() {
        System.out.println("Platform: Swiggy");
    }

    @Override
    public void serviceType() {
        System.out.println("Service Type: Online food delivery");
    }

    @Override
    public void deliveryTime() {
        System.out.println("Delivery Time: 20 to 60 minutes");
    }

    @Override
    public void paymentModes() {
        System.out.println("Payment Modes: UPI, Cards, Swiggy Wallet");
    }

    @Override
    public void customerSupport() {
        System.out.println("Customer Support: 24/7 in-app support");
    }
}
