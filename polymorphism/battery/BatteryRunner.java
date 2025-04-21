package com.xworkz.polymorphism.battery;

public class BatteryRunner {
    public static void main(String[] args) {
        System.out.println("Child(Lithium Battery) Details");
        LithiumBattery lithiumBattery =new LithiumBattery();
        lithiumBattery.charge();
        lithiumBattery.discharge();
        lithiumBattery.status();
        lithiumBattery.type();
        lithiumBattery.company();
        System.out.println();

        System.out.println("Parent(Battery) Details");
        Battery battery =new Battery();
        battery.charge();
        battery.discharge();
        battery.status();
        battery.type();
        battery.company();
        System.out.println();

        System.out.println("Child(LithiumBattery) of Parent type Details");
        Battery lithiumOfBatteryType =new LithiumBattery();
        lithiumOfBatteryType.charge();
        lithiumOfBatteryType.discharge();
        lithiumOfBatteryType.status();
        lithiumOfBatteryType.type();
        lithiumOfBatteryType.company();
        
    }
}
