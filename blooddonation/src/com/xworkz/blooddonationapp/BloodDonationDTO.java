package com.xworkz.blooddonationapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode(){
        return Objects.hash(donorName,age,bloodGroup,donationDate,isFirstTimeDonor);
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof  BloodDonationDTO){
            BloodDonationDTO dto= (BloodDonationDTO)obj;
//            if(this.donorName.equals(dto.donorName) && this.age == dto.age && this.bloodGroup.equals(dto.bloodGroup) &&
//                    this.donationDate.equals(dto.donationDate ) && this.isFirstTimeDonor == dto.isFirstTimeDonor)
                   if(this.hashCode() == dto.hashCode()){
                return true;
            }
        }
    return false;
    }
}