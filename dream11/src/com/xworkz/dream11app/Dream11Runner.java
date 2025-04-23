package com.xworkz.dream11app;

public class Dream11Runner {
    public static void main(String[] args) {
        Dream11DTO dto = new Dream11DTO();
        dto.setTeamName("Super Kings");
        dto.setCaptain("MS Dhoni");
        dto.setPoints(350);
        dto.setMatchDate("2025-04-25");
        System.out.println(dto);
    }
}
