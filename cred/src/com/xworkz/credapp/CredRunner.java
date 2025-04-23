package com.xworkz.credapp;

public class CredRunner {
    public static void main(String[] args) {
        CredDTO dto = new CredDTO();
        dto.setUserName("Karan Mehta");
        dto.setCardType("Visa");
        dto.setBillAmount(7500.50);
        dto.setDueDate("2025-05-01");
        System.out.println(dto);
    }
}
