package com.xworkz.polymorphism.media;

public class Audio extends Media {
    @Override
    public void type() {
        System.out.println("Type: Audio Media");
    }

    @Override
    public void format() {
        System.out.println("Format: MP3, WAV, FLAC, AAC");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Music, podcasts, radio, etc.");
    }

    @Override
    public void quality() {
        System.out.println("Quality: High quality, varies with format");
    }

    @Override
    public void price() {
        System.out.println("Price: Varies based on quality and format");
    }
}
