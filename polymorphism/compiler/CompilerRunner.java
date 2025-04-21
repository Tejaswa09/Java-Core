package com.xworkz.polymorphism.compiler;

public class CompilerRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        JavaCompiler javaCompiler = new JavaCompiler();
        javaCompiler.name();
        javaCompiler.language();
        javaCompiler.type();
        javaCompiler.version();
        javaCompiler.executionType();
        System.out.println();

        System.out.println("Parent Details:");
        Compiler compiler = new Compiler();
        compiler.name();
        compiler.language();
        compiler.type();
        compiler.version();
        compiler.executionType();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Compiler javaCompilerAsCompiler = new JavaCompiler();
        javaCompilerAsCompiler.name();
        javaCompilerAsCompiler.language();
        javaCompilerAsCompiler.type();
        javaCompilerAsCompiler.version();
        javaCompilerAsCompiler.executionType();
    }
}
