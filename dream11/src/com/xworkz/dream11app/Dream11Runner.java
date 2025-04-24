package com.xworkz.dream11app;

public class Dream11Runner {
    public static void main(String[] args) {
        Dream11DTO dto = new Dream11DTO();
        dto.setTeamName("Super Kings");
        dto.setCaptain("MS Dhoni");
        dto.setPoints(350);
        dto.setMatchDate("2025-04-25");
        //System.out.println(dto);

        Dream11DTO dto1 = new Dream11DTO();
        dto1.setTeamName("Super Kings");
        dto1.setCaptain("MS Dhoni");
        dto1.setPoints(350);
        dto1.setMatchDate("2025-04-25");

        System.out.println(dto.equals(dto1));
    }
}
