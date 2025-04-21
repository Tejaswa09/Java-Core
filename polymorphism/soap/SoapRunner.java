package com.xworkz.polymorphism.soap;

public class SoapRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        MysoreSandle mysoreSandle = new MysoreSandle();
        mysoreSandle.type();
        mysoreSandle.fragrance();
        mysoreSandle.usage();
        mysoreSandle.ingredients();
        mysoreSandle.packaging();
        System.out.println();

        System.out.println("Parent Details:");
        Soap soap = new Soap();
        soap.type();
        soap.fragrance();
        soap.usage();
        soap.ingredients();
        soap.packaging();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Soap mysoreSandleAsSoap = new MysoreSandle();
        mysoreSandleAsSoap.type();
        mysoreSandleAsSoap.fragrance();
        mysoreSandleAsSoap.usage();
        mysoreSandleAsSoap.ingredients();
        mysoreSandleAsSoap.packaging();
    }
}
