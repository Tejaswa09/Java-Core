package com.xworkz.canvaapp;

public class CanvaRunner {
    public static void main(String[] args) {
        CanvaDTO dto = new CanvaDTO();
        dto.setTemplateName("Modern Resume");
        dto.setCategory("Professional");
        dto.setDownloads(1200);
        dto.setPremium(true);
        System.out.println(dto);
    }

}
