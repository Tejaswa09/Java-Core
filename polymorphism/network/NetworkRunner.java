package com.xworkz.polymorphism.network;

public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        WifiNetwork wifiNetwork = new WifiNetwork();
        wifiNetwork.type();
        wifiNetwork.speed();
        wifiNetwork.security();
        wifiNetwork.coverage();
        wifiNetwork.cost();
        System.out.println();

        System.out.println("Parent Details:");
        Network network = new Network();
        network.type();
        network.speed();
        network.security();
        network.coverage();
        network.cost();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Network wifiNetworkAsNetwork = new WifiNetwork();
        wifiNetworkAsNetwork.type();
        wifiNetworkAsNetwork.speed();
        wifiNetworkAsNetwork.security();
        wifiNetworkAsNetwork.coverage();
        wifiNetworkAsNetwork.cost();
    }
}
