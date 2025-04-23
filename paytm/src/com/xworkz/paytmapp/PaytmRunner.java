package com.xworkz.paytmapp;

public class PaytmRunner {
    public static void main(String[] args) {
        PaytmDTO dto = new PaytmDTO();
        dto.setRechargeType("Prepaid");
        dto.setMobileNumber("9876543210");
        dto.setAmount(199.0);
        dto.setOperator("Jio");
        System.out.println(dto);
    }
}
