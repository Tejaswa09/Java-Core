package com.xworkz.phonepeapp;

public class PhonePeRunner {
    public static void main(String[] args) {
        PhonePeDTO dto = new PhonePeDTO();
        dto.setTransactionId("TXN12345");
        dto.setAmount(1500.75);
        dto.setReceiver("Ramesh");
        dto.setTransactionDate("2025-04-23");
        System.out.println(dto);
    }
}
