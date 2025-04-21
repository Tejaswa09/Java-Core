package com.xworkz.polymorphism.browser;

public class Chrome extends Browser {
    @Override
    public void name() {
        System.out.println("Google Chrome");
    }

    @Override
    public void developer() {
        System.out.println("Developed by Google");
    }

    @Override
    public void engine() {
        System.out.println("Uses Blink engine");
    }

    @Override
    public void incognitoMode() {
        System.out.println("Incognito mode: Supported");
    }

    @Override
    public void extensionsSupport() {
        System.out.println("Supports a wide range of extensions from Chrome Web Store");
    }
}
