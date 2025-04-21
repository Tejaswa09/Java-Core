package com.xworkz.polymorphism.compiler;

public class JavaCompiler extends Compiler {
    @Override
    public void name() {
        System.out.println("Java Compiler");
    }

    @Override
    public void language() {
        System.out.println("Language: Java");
    }

    @Override
    public void type() {
        System.out.println("Type: High-Level Language Compiler");
    }

    @Override
    public void version() {
        System.out.println("Version: JDK 17");
    }

    @Override
    public void executionType() {
        System.out.println("Execution Type: Bytecode Generation");
    }
}
