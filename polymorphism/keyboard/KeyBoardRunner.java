package com.xworkz.polymorphism.keyboard;

public class KeyBoardRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        MechanicalKeyBoard mechanicalKeyBoard = new MechanicalKeyBoard();
        mechanicalKeyBoard.type();
        mechanicalKeyBoard.connection();
        mechanicalKeyBoard.keys();
        mechanicalKeyBoard.price();
        mechanicalKeyBoard.usage();
        System.out.println();

        System.out.println("Parent Details:");
        KeyBoard keyBoard = new KeyBoard();
        keyBoard.type();
        keyBoard.connection();
        keyBoard.keys();
        keyBoard.price();
        keyBoard.usage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        KeyBoard mechanicalKeyBoardAsKeyBoard = new MechanicalKeyBoard();
        mechanicalKeyBoardAsKeyBoard.type();
        mechanicalKeyBoardAsKeyBoard.connection();
        mechanicalKeyBoardAsKeyBoard.keys();
        mechanicalKeyBoardAsKeyBoard.price();
        mechanicalKeyBoardAsKeyBoard.usage();
    }
}
