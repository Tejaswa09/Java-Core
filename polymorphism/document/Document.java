package com.xworkz.polymorphism.document;

public class Document {
    public void fileType() {
        System.out.println("File Type: Generic Document");
    }

    public void size() {
        System.out.println("Size: Depends on content");
    }

    public void readableOn() {
        System.out.println("Readable On: Any document reader");
    }

    public void hasPasswordProtection() {
        System.out.println("Password Protection: Optional");
    }

    public void supportsEditing() {
        System.out.println("Supports Editing: Yes");
    }
}
