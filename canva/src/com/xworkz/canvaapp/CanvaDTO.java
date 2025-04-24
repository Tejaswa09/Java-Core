package com.xworkz.canvaapp;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(templateName, category, downloads, isPremium);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CanvaDTO) {
            CanvaDTO dto = (CanvaDTO) obj;
            if (this.hashCode() == dto.hashCode()) {
                return true;
            }
        }
        return false;
    }
}