package com.xworkz.polymorphism.cloud;

public class StorageService extends CloudService {
    @Override
    public void provider() {
        System.out.println("Provider: Amazon Web Services (AWS)");
    }

    @Override
    public void serviceType() {
        System.out.println("Service Type: Storage (e.g., Amazon S3)");
    }

    @Override
    public void availability() {
        System.out.println("Availability: Multi-region");
    }

    @Override
    public void pricing() {
        System.out.println("Pricing: Pay-as-you-go, per GB/month");
    }

    @Override
    public void features() {
        System.out.println("Features: Object Storage, Versioning, Encryption, Lifecycle Policies");
    }
}
