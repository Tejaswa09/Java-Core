package com.xworkz.phonepeapp;

public class PhonePeRunner {
    public static void main(String[] args) {
        PhonePeDTO dto = new PhonePeDTO();
        dto.setTransactionId("TXN12345");
        dto.setAmount(1500.75);
        dto.setReceiver("Ramesh");
        dto.setTransactionDate("2025-04-23");
        //System.out.println(dto);

        PhonePeDTO dto1 = new PhonePeDTO();
        dto1.setTransactionId("TXN12345");
        dto1.setAmount(1500.75);
        dto1.setReceiver("Ramesh");
        dto1.setTransactionDate("2025-04-23");
        System.out.println(dto.equals(dto1));
    }
}
