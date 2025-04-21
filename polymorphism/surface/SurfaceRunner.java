package com.xworkz.polymorphism.surface;

public class SurfaceRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Touchscreen touchscreen = new Touchscreen();
        touchscreen.type();
        touchscreen.material();
        touchscreen.functionality();
        touchscreen.durability();
        touchscreen.usage();
        System.out.println();

        System.out.println("Parent Details:");
        Surface surface = new Surface();
        surface.type();
        surface.material();
        surface.functionality();
        surface.durability();
        surface.usage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Surface touchscreenAsSurface = new Touchscreen();
        touchscreenAsSurface.type();
        touchscreenAsSurface.material();
        touchscreenAsSurface.functionality();
        touchscreenAsSurface.durability();
        touchscreenAsSurface.usage();
    }
}
