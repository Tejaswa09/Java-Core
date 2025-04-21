package com.xworkz.polymorphism.cloud;

public class CloudRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        StorageService storage = new StorageService();
        storage.provider();
        storage.serviceType();
        storage.availability();
        storage.pricing();
        storage.features();
        System.out.println();

        System.out.println("Parent Details:");
        CloudService cloud = new CloudService();
        cloud.provider();
        cloud.serviceType();
        cloud.availability();
        cloud.pricing();
        cloud.features();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        CloudService storageAsCloud = new StorageService();
        storageAsCloud.provider();
        storageAsCloud.serviceType();
        storageAsCloud.availability();
        storageAsCloud.pricing();
        storageAsCloud.features();
    }
}
