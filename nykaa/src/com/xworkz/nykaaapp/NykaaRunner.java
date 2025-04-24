package com.xworkz.nykaaapp;

public class NykaaRunner {
    public static void main(String[] args) {
        NykaaDTO dto = new NykaaDTO();
        dto.setProductName("Moisturizer");
        dto.setBrand("The Body Shop");
        dto.setPrice(599.0);
        dto.setSkinType("Dry");

        NykaaDTO dto1 = new NykaaDTO();
        dto1.setProductName("Moisturizer");
        dto1.setBrand("The Body Shop");
        dto1.setPrice(599.0);
        dto1.setSkinType("Dry");
        //System.out.println(dto);
        System.out.println(dto.equals(dto1));
    }

}
