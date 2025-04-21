package com.xworkz.polymorphism.router;

public class RouterRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        WirelessRouter wirelessRouter = new WirelessRouter();
        wirelessRouter.type();
        wirelessRouter.connectivity();
        wirelessRouter.speed();
        wirelessRouter.range();
        wirelessRouter.security();
        System.out.println();

        System.out.println("Parent Details:");
        Router router = new Router();
        router.type();
        router.connectivity();
        router.speed();
        router.range();
        router.security();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Router wirelessRouterAsRouter = new WirelessRouter();
        wirelessRouterAsRouter.type();
        wirelessRouterAsRouter.connectivity();
        wirelessRouterAsRouter.speed();
        wirelessRouterAsRouter.range();
        wirelessRouterAsRouter.security();
    }
}
