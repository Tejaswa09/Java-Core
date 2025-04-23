package com.xworkz.practoapp;

public class PractoRunner {
    public static void main(String[] args) {
        PractoDTO dto = new PractoDTO();
        dto.setDoctorName("Dr. Kumar");
        dto.setSpecialization("Orthopedic");
        dto.setConsultationFee(1000.0);
        dto.setAppointmentDate("2025-05-10");
        System.out.println(dto);
    }
}
