package com.xworkz.polymorphism.browser;

public class BrowserRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        Chrome chrome = new Chrome();
        chrome.name();
        chrome.developer();
        chrome.engine();
        chrome.incognitoMode();
        chrome.extensionsSupport();
        System.out.println();

        System.out.println("Parent Details:");
        Browser browser = new Browser();
        browser.name();
        browser.developer();
        browser.engine();
        browser.incognitoMode();
        browser.extensionsSupport();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Browser chromeAsBrowser = new Chrome();
        chromeAsBrowser.name();
        chromeAsBrowser.developer();
        chromeAsBrowser.engine();
        chromeAsBrowser.incognitoMode();
        chromeAsBrowser.extensionsSupport();
    }
}
