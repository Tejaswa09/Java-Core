package com.xworkz.blooddonationapp;

public class BloodDonationRunner {
    public static void main(String[] args) {
        BloodDonationDTO dto = new BloodDonationDTO();
        dto.setDonorName("Rahul");
        dto.setAge(28);
        dto.setBloodGroup("B+");
        dto.setDonationDate("2025-04-20");
        dto.setFirstTimeDonor(true);
        System.out.println(dto);
    }
}
