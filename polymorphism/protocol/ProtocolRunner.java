package com.xworkz.polymorphism.protocol;

public class ProtocolRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        HTTP http = new HTTP();
        http.protocolType();
        http.method();
        http.port();
        http.security();
        http.useCase();
        System.out.println();

        System.out.println("Parent Details:");
        Protocol protocol = new Protocol();
        protocol.protocolType();
        protocol.method();
        protocol.port();
        protocol.security();
        protocol.useCase();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Protocol httpAsProtocol = new HTTP();
        httpAsProtocol.protocolType();
        httpAsProtocol.method();
        httpAsProtocol.port();
        httpAsProtocol.security();
        httpAsProtocol.useCase();
    }
}
