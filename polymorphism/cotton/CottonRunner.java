package com.xworkz.polymorphism.cotton;

public class CottonRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Blanket blanket = new Blanket();
        blanket.material();
        blanket.usage();
        blanket.texture();
        blanket.weight();
        blanket.careInstructions();
        System.out.println();

        System.out.println("Parent Details:");
        Cotton cotton = new Cotton();
        cotton.material();
        cotton.usage();
        cotton.texture();
        cotton.weight();
        cotton.careInstructions();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Cotton blanketAsCotton = new Blanket();
        blanketAsCotton.material();
        blanketAsCotton.usage();
        blanketAsCotton.texture();
        blanketAsCotton.weight();
        blanketAsCotton.careInstructions();
    }
}
