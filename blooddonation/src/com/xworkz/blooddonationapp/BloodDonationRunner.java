package com.xworkz.blooddonationapp;

public class BloodDonationRunner {
    public static void main(String[] args) {
        BloodDonationDTO dto = new BloodDonationDTO();
        dto.setDonorName("Rahul");
        dto.setAge(28);
        dto.setBloodGroup("B+");
        dto.setDonationDate("2025-04-20");
        dto.setFirstTimeDonor(true);
        //System.out.println(dto);

        BloodDonationDTO dto1 = new BloodDonationDTO();
        dto1.setDonorName("Rahul");
        dto1.setAge(28);
        dto1.setBloodGroup("B+");
        dto1.setDonationDate("2025-04-20");
        dto1.setFirstTimeDonor(true);

        System.out.println(dto1.equals(dto));
    }
}
