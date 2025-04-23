package com.xworkz.canvaapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CanvaDTO {
    private String templateName;
    private String category;
    private int downloads;
    private boolean isPremium;

    @Override
    public String toString() {
        return "CanvaDTO [templateName=" + templateName + ", category=" + category + ", downloads=" + downloads + ", isPremium=" + isPremium + "]";
    }
}