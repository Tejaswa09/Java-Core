package com.xworkz.practoapp;

public class PractoRunner {
    public static void main(String[] args) {
        PractoDTO dto = new PractoDTO();
        dto.setDoctorName("Dr. Kumar");
        dto.setSpecialization("Orthopedic");
        dto.setConsultationFee(1000.0);
        dto.setAppointmentDate("2025-05-10");
       // System.out.println(dto);

        PractoDTO dto1 = new PractoDTO();
        dto1.setDoctorName("Dr. Kumar");
        dto1.setSpecialization("Orthopedic");
        dto1.setConsultationFee(1000.0);
        dto1.setAppointmentDate("2025-05-10");
        System.out.println(dto.equals(dto1));
    }
}
