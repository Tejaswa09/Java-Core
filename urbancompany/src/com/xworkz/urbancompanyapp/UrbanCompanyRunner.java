package com.xworkz.urbancompanyapp;

class UrbanCompanyRunner {
    public static void main(String[] args) {
        UrbanCompanyDTO dto = new UrbanCompanyDTO();
        dto.setServiceType("Haircut");
        dto.setProviderName("Raj");
        dto.setCost(299.99);
        dto.setDuration("45 minutes");
        System.out.println(dto);
    }
}
