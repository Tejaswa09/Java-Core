package com.xworkz.urbancompanyapp;

import lombok.Getter;
import lombok.Setter;

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
}