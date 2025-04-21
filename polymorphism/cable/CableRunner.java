package com.xworkz.polymorphism.cable;

public class CableRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        HDMI hdmi = new HDMI();
        hdmi.type();
        hdmi.length();
        hdmi.usedFor();
        hdmi.supportsAudio();
        hdmi.supportsVideo();
        System.out.println();

        System.out.println("Parent Details:");
        Cable cable = new Cable();
        cable.type();
        cable.length();
        cable.usedFor();
        cable.supportsAudio();
        cable.supportsVideo();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Cable hdmiAsCable = new HDMI();
        hdmiAsCable.type();
        hdmiAsCable.length();
        hdmiAsCable.usedFor();
        hdmiAsCable.supportsAudio();
        hdmiAsCable.supportsVideo();
    }
}
