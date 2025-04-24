package com.xworkz.netflixapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NetflixDTO {
    private String showTitle;
    private String genre;
    private int seasons;
    private double imdbRating;

    @Override
    public String toString() {
        return "NetflixDTO [showTitle=" + showTitle + ", genre=" + genre + ", seasons=" + seasons + ", imdbRating=" + imdbRating + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NetflixDTO) {
            NetflixDTO dto = (NetflixDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}
