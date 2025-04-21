package com.xworkz.polymorphism.cable;

public class Cable {
    public void type() {
        System.out.println("Generic Cable");
    }

    public void length() {
        System.out.println("Length: 1 meter");
    }

    public void usedFor() {
        System.out.println("Used for electrical or data transmission");
    }

    public void supportsAudio() {
        System.out.println("Audio support: Unknown");
    }

    public void supportsVideo() {
        System.out.println("Video support: Unknown");
    }
}
