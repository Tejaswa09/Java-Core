package com.xworkz.redbusapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class RedBusDTO {
    private String source;
    private String destination;
    private String busType;
    private double ticketPrice;

    @Override
    public String toString() {
        return "RedBusDTO [source=" + source + ", destination=" + destination + ", busType=" + busType + ", ticketPrice=" + ticketPrice + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destination, busType, ticketPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RedBusDTO) {
            RedBusDTO dto = (RedBusDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}