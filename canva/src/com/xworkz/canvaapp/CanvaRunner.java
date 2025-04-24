package com.xworkz.canvaapp;

public class CanvaRunner {
    public static void main(String[] args) {
        CanvaDTO dto = new CanvaDTO();
        dto.setTemplateName("Modern Resume");
        dto.setCategory("Professional");
        dto.setDownloads(1200);
        dto.setPremium(true);
        //System.out.println(dto);

        CanvaDTO dto1 = new CanvaDTO();
        dto1.setTemplateName("Modern Resume");
        dto1.setCategory("Professional");
        dto1.setDownloads(1200);
        dto1.setPremium(true);
        System.out.println(dto.equals(dto1));

    }

}
