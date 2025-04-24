package com.xworkz.zoomapp;

import java.util.Objects;

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

    @Override
    public int hashCode(){
        return Objects.hash(meetingId,host,duration,recorded);
    }
//
    @Override
    public boolean equals(Object obj){
        if (obj instanceof ZoomDTO){
            ZoomDTO dto=(ZoomDTO)obj;
            if(this.hashCode() == dto.hashCode()){
                return true;
            }
        }
        return false;
    }

}