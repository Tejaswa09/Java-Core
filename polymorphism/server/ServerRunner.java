package com.xworkz.polymorphism.server;

public class ServerRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        DatabaseServer dbServer = new DatabaseServer();
        dbServer.type();
        dbServer.functionality();
        dbServer.capacity();
        dbServer.security();
        dbServer.usage();
        System.out.println();

        System.out.println("Parent Details:");
        Server server = new Server();
        server.type();
        server.functionality();
        server.capacity();
        server.security();
        server.usage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Server dbServerAsServer = new DatabaseServer();
        dbServerAsServer.type();
        dbServerAsServer.functionality();
        dbServerAsServer.capacity();
        dbServerAsServer.security();
        dbServerAsServer.usage();
    }
}
