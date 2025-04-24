package com.xworkz.paytmapp;

public class PaytmRunner {
    public static void main(String[] args) {
        PaytmDTO dto = new PaytmDTO();
        dto.setRechargeType("Prepaid");
        dto.setMobileNumber("9876543210");
        dto.setAmount(199.0);
        dto.setOperator("Jio");
        System.out.println(dto);

        PaytmDTO dto1 = new PaytmDTO();
        dto1.setRechargeType("Prepaid");
        dto1.setMobileNumber("9876543210");
        dto1.setAmount(199.0);
        dto1.setOperator("Jio");

        System.out.println(dto.equals(dto1));
    }
}
