package com.xworkz.practoapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(doctorName, specialization, consultationFee, appointmentDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PractoDTO) {
            PractoDTO dto = (PractoDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}