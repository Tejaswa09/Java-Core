package com.xworkz.credapp;

public class CredRunner {
    public static void main(String[] args) {
        CredDTO dto = new CredDTO();
        dto.setUserName("Karan Mehta");
        dto.setCardType("Visa");
        dto.setBillAmount(7500.50);
        dto.setDueDate("2025-05-01");
//        System.out.println(dto);

        CredDTO dto1 = new CredDTO();
        dto1.setUserName("Karan Mehta");
        dto1.setCardType("Visa");
        dto1.setBillAmount(7500.50);
        dto1.setDueDate("2025-05-01");
//        System.out.println(dto);

        System.out.println(dto.equals(dto1));

//        System.out.println(dto.getUserName().hashCode());




    }
}
