package com.xworkz.polymorphism.publication;

public class PublicationRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Magazine magazine = new Magazine();
        magazine.title();
        magazine.author();
        magazine.publishDate();
        magazine.genre();
        magazine.language();
        System.out.println();

        System.out.println("Parent Details:");
        Publication publication = new Publication();
        publication.title();
        publication.author();
        publication.publishDate();
        publication.genre();
        publication.language();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Publication magazineAsPublication = new Magazine();
        magazineAsPublication.title();
        magazineAsPublication.author();
        magazineAsPublication.publishDate();
        magazineAsPublication.genre();
        magazineAsPublication.language();
    }
}
