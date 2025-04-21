package com.xworkz.polymorphism.logger;

public class Logger {
    public void log(String message) {
        System.out.println("Logging message: " + message);
    }

    public void logError(String error) {
        System.out.println("Logging error: " + error);
    }

    public void logInfo(String info) {
        System.out.println("Logging info: " + info);
    }

    public void logWarning(String warning) {
        System.out.println("Logging warning: " + warning);
    }
}
