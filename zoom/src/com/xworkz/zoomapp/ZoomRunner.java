package com.xworkz.zoomapp;

public class ZoomRunner {
    public static void main(String[] args) {
        ZoomDTO dto = new ZoomDTO();
        dto.setMeetingId("123-456-789");
        dto.setHost("Anjali");
        dto.setDuration(45);
        dto.setRecorded(true);
        System.out.println(dto);
    }

}
