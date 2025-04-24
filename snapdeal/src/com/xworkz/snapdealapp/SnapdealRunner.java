package com.xworkz.snapdealapp;

public class SnapdealRunner {
    public static void main(String[] args) {
        SnapdealDTO dto = new SnapdealDTO();
        dto.setProductName("Smartphone");
        dto.setDiscount(25.0);
        dto.setAvailableQuantity(50);
        dto.setSellerName("Best Electronics");

        SnapdealDTO dto1 = new SnapdealDTO();
        dto1.setProductName("Smartphone");
        dto1.setDiscount(25.0);
        dto1.setAvailableQuantity(50);
        dto1.setSellerName("Best Electronics");

        System.out.println(dto.equals(dto1));
        //System.out.println(dto);
    }
}
