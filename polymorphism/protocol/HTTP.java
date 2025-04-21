package com.xworkz.polymorphism.protocol;

public class HTTP extends Protocol {
    @Override
    public void protocolType() {
        System.out.println("Protocol Type: Hypertext Transfer Protocol (HTTP)");
    }

    @Override
    public void method() {
        System.out.println("Method: GET, POST, PUT, DELETE");
    }

    @Override
    public void port() {
        System.out.println("Port: 80 (default for HTTP), 443 (for HTTPS)");
    }

    @Override
    public void security() {
        System.out.println("Security: HTTPS uses SSL/TLS for encryption");
    }

    @Override
    public void useCase() {
        System.out.println("Use Case: Used for transferring web pages and resources over the web");
    }
}
