package com.xworkz.polymorphism.document;

public class PdfDocument extends Document {
    @Override
    public void fileType() {
        System.out.println("File Type: PDF (.pdf)");
    }

    @Override
    public void size() {
        System.out.println("Size: Typically smaller due to compression");
    }

    @Override
    public void readableOn() {
        System.out.println("Readable On: PDF readers (like Adobe Acrobat)");
    }

    @Override
    public void hasPasswordProtection() {
        System.out.println("Password Protection: Common feature");
    }

    @Override
    public void supportsEditing() {
        System.out.println("Supports Editing: Limited; needs special tools");
    }
}
