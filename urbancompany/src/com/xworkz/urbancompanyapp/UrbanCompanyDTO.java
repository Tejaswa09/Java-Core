package com.xworkz.urbancompanyapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class UrbanCompanyDTO {
    private String serviceType;
    private String providerName;
    private double cost;
    private String duration;

    @Override
    public String toString() {
        return "UrbanCompanyDTO [serviceType=" + serviceType + ", providerName=" + providerName + ", cost=" + cost + ", duration=" + duration + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, providerName, cost, duration);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UrbanCompanyDTO) {
            UrbanCompanyDTO dto = (UrbanCompanyDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}