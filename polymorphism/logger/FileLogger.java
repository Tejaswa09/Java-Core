package com.xworkz.polymorphism.logger;

public class FileLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Logging message to file: " + message);
    }

    @Override
    public void logError(String error) {
        System.out.println("Logging error to file: " + error);
    }

    @Override
    public void logInfo(String info) {
        System.out.println("Logging info to file: " + info);
    }

    @Override
    public void logWarning(String warning) {
        System.out.println("Logging warning to file: " + warning);
    }
}
