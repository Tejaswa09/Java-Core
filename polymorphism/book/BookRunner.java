package com.xworkz.polymorphism.book;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Novel novel = new Novel();
        novel.title();
        novel.author();
        novel.genre();
        novel.price();
        novel.pages();
        System.out.println();

        System.out.println("Parent Details:");
        Book book = new Book();
        book.title();
        book.author();
        book.genre();
        book.price();
        book.pages();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Book novelAsBook = new Novel();
        novelAsBook.title();
        novelAsBook.author();
        novelAsBook.genre();
        novelAsBook.price();
        novelAsBook.pages();
    }
}
