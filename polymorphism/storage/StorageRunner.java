package com.xworkz.polymorphism.storage;

public class StorageRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        SSD ssd = new SSD();
        ssd.type();
        ssd.capacity();
        ssd.speed();
        ssd.durability();
        ssd.usage();
        System.out.println();

        System.out.println("Parent Details:");
        Storage storage = new Storage();
        storage.type();
        storage.capacity();
        storage.speed();
        storage.durability();
        storage.usage();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Storage ssdAsStorage = new SSD();
        ssdAsStorage.type();
        ssdAsStorage.capacity();
        ssdAsStorage.speed();
        ssdAsStorage.durability();
        ssdAsStorage.usage();
    }
}
