package com.xworkz.zoomapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZoomDTO {
    private String meetingId;
    private String host;
    private int duration;
    private boolean recorded;

    @Override
    public String toString() {
        return "ZoomDTO [meetingId=" + meetingId + ", host=" + host + ", duration=" + duration + ", recorded=" + recorded + "]";
    }
}