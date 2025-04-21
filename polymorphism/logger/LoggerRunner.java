package com.xworkz.polymorphism.logger;

public class LoggerRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("This is a message");
        fileLogger.logError("This is an error");
        fileLogger.logInfo("This is an info");
        fileLogger.logWarning("This is a warning");
        System.out.println();

        System.out.println("Parent Details:");
        Logger logger = new Logger();
        logger.log("This is a message");
        logger.logError("This is an error");
        logger.logInfo("This is an info");
        logger.logWarning("This is a warning");
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Logger fileLoggerAsLogger = new FileLogger();
        fileLoggerAsLogger.log("This is a message");
        fileLoggerAsLogger.logError("This is an error");
        fileLoggerAsLogger.logInfo("This is an info");
        fileLoggerAsLogger.logWarning("This is a warning");
    }
}
