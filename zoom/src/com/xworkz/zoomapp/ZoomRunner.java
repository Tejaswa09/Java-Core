package com.xworkz.zoomapp;

import java.util.Objects;

public class ZoomRunner {
    public static void main(String[] args) {
        ZoomDTO dto = new ZoomDTO();
        dto.setMeetingId("123-456-789");
        dto.setHost("Anjali");
        dto.setDuration(45);
        dto.setRecorded(true);

        ZoomDTO dto1 = new ZoomDTO();
        dto1.setMeetingId("123-456-789");
        dto1.setHost("Anjali");
        dto1.setDuration(45);
        dto1.setRecorded(true);
        //System.out.println(dto);
        System.out.println(dto.equals(dto1));
    }

}
