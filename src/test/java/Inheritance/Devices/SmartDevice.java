package Inheritance.Devices;
//parent
public class SmartDevice {
    String brand;
    int batteryLife;

    // Constructor
    public SmartDevice(String brand, int batteryLife){
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    // Instance Methods/Object Behaviors
    void turnOn(){
        System.out.println(brand + " device is turning on.");
        System.out.println("This turn on method is from SmartDevice class.");
    }

    void turnOff(){
        System.out.println(brand + " device is turning off.");
    }

    // Static method
    static void deviceInfo(){
        // general message about all smart devices

        System.out.println("Smart devices are electronic devices with advanced features.");
    }



}
