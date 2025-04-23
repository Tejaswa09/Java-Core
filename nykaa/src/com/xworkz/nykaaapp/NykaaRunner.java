package com.xworkz.nykaaapp;

public class NykaaRunner {
    public static void main(String[] args) {
        NykaaDTO dto = new NykaaDTO();
        dto.setProductName("Moisturizer");
        dto.setBrand("The Body Shop");
        dto.setPrice(599.0);
        dto.setSkinType("Dry");
        System.out.println(dto);
    }

}
