package com.xworkz.polymorphism.cable;

public class HDMI extends Cable {
    @Override
    public void type() {
        System.out.println("HDMI Cable");
    }

    @Override
    public void length() {
        System.out.println("Length: 2 meters");
    }

    @Override
    public void usedFor() {
        System.out.println("Used for connecting display and audio devices");
    }

    @Override
    public void supportsAudio() {
        System.out.println("Audio support: Yes");
    }

    @Override
    public void supportsVideo() {
        System.out.println("Video support: Yes (4K & 8K supported)");
    }
}
