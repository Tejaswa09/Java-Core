package com.xworkz.snapdealapp;

public class SnapdealRunner {
    public static void main(String[] args) {
        SnapdealDTO dto = new SnapdealDTO();
        dto.setProductName("Smartphone");
        dto.setDiscount(25.0);
        dto.setAvailableQuantity(50);
        dto.setSellerName("Best Electronics");
        System.out.println(dto);
    }
}
