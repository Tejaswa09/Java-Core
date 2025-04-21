package com.xworkz.polymorphism.guide;

public class GuideRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Recipe recipe = new Recipe();
        recipe.title();
        recipe.steps();
        recipe.purpose();
        recipe.toolsRequired();
        recipe.duration();
        System.out.println();

        System.out.println("Parent Details:");
        Guide guide = new Guide();
        guide.title();
        guide.steps();
        guide.purpose();
        guide.toolsRequired();
        guide.duration();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Guide recipeAsGuide = new Recipe();
        recipeAsGuide.title();
        recipeAsGuide.steps();
        recipeAsGuide.purpose();
        recipeAsGuide.toolsRequired();
        recipeAsGuide.duration();
    }
}
