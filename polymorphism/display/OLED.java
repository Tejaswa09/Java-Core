package com.xworkz.polymorphism.display;

public class OLED extends Display {
    @Override
    public void type() {
        System.out.println("Type: OLED Display");
    }

    @Override
    public void resolution() {
        System.out.println("Resolution: 4K UHD");
    }

    @Override
    public void powerConsumption() {
        System.out.println("Power Consumption: Low (per pixel control)");
    }

    @Override
    public void contrastRatio() {
        System.out.println("Contrast Ratio: Infinite");
    }

    @Override
    public void flexibility() {
        System.out.println("Flexibility: Can be flexible or foldable");
    }
}
