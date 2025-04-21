package com.xworkz.polymorphism.encryption;

public class EncryptionRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        AESEncryption aes = new AESEncryption();
        aes.algorithmName();
        aes.keyLength();
        aes.encryptionSpeed();
        aes.securityLevel();
        aes.modeOfOperation();
        System.out.println();

        System.out.println("Parent Details:");
        Encryption encryption = new Encryption();
        encryption.algorithmName();
        encryption.keyLength();
        encryption.encryptionSpeed();
        encryption.securityLevel();
        encryption.modeOfOperation();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Encryption aesAsEncryption = new AESEncryption();
        aesAsEncryption.algorithmName();
        aesAsEncryption.keyLength();
        aesAsEncryption.encryptionSpeed();
        aesAsEncryption.securityLevel();
        aesAsEncryption.modeOfOperation();
    }
}
