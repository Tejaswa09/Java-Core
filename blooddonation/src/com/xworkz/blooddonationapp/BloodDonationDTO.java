package com.xworkz.blooddonationapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BloodDonationDTO {
    private String donorName;
    private int age;
    private String bloodGroup;
    private String donationDate;
    private boolean isFirstTimeDonor;

    @Override
    public String toString() {
        return "BloodDonationDTO [donorName=" + donorName + ", age=" + age + ", bloodGroup=" + bloodGroup +
                ", donationDate=" + donationDate + ", isFirstTimeDonor=" + isFirstTimeDonor + "]";
    }
}