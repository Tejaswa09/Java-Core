package com.xworkz.polymorphism.media;

public class MediaRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Audio audio = new Audio();
        audio.type();
        audio.format();
        audio.usage();
        audio.quality();
        audio.price();
        System.out.println();

        System.out.println("Parent Details:");
        Media media = new Media();
        media.type();
        media.format();
        media.usage();
        media.quality();
        media.price();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Media audioAsMedia = new Audio();
        audioAsMedia.type();
        audioAsMedia.format();
        audioAsMedia.usage();
        audioAsMedia.quality();
        audioAsMedia.price();
    }
}
