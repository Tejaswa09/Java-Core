package com.xworkz.practoapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PractoDTO {
    private String doctorName;
    private String specialization;
    private double consultationFee;
    private String appointmentDate;

    @Override
    public String toString() {
        return "PractoDTO [doctorName=" + doctorName + ", specialization=" + specialization + ", consultationFee=" + consultationFee + ", appointmentDate=" + appointmentDate + "]";
    }
}