package com.xworkz.dream11app;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(teamName, captain, points, matchDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dream11DTO) {
            Dream11DTO dto = (Dream11DTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}