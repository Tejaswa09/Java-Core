package com.xworkz.polymorphism.encryption;

public class AESEncryption extends Encryption {
    @Override
    public void algorithmName() {
        System.out.println("Algorithm: AES (Advanced Encryption Standard)");
    }

    @Override
    public void keyLength() {
        System.out.println("Key Length: 128, 192, or 256 bits");
    }

    @Override
    public void encryptionSpeed() {
        System.out.println("Encryption Speed: Fast and efficient");
    }

    @Override
    public void securityLevel() {
        System.out.println("Security Level: High");
    }

    @Override
    public void modeOfOperation() {
        System.out.println("Mode: Typically CBC, GCM, or CTR");
    }
}
