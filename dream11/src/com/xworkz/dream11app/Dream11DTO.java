package com.xworkz.dream11app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dream11DTO {
    private String teamName;
    private String captain;
    private int points;
    private String matchDate;

    @Override
    public String toString() {
        return "Dream11DTO [teamName=" + teamName + ", captain=" + captain + ", points=" + points + ", matchDate=" + matchDate + "]";
    }
}