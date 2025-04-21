package com.xworkz.polymorphism.tool;

public class ToolRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Hammer hammer = new Hammer();
        hammer.type();
        hammer.material();
        hammer.functionality();
        hammer.usage();
        hammer.weight();
        System.out.println();

        System.out.println("Parent Details:");
        Tool tool = new Tool();
        tool.type();
        tool.material();
        tool.functionality();
        tool.usage();
        tool.weight();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Tool hammerAsTool = new Hammer();
        hammerAsTool.type();
        hammerAsTool.material();
        hammerAsTool.functionality();
        hammerAsTool.usage();
        hammerAsTool.weight();
    }
}
