package Inheritance.Devices;

public class DeviceTest {
    public static void main(String[] args) {
     // Let's learn about all smart devices.
        System.out.println("_________________________________________________________________________");
    SmartDevice.deviceInfo();

    SmartDevice genericDevice = new SmartDevice("GenericBrand",24);
    // What can I do with generic Device object?
        genericDevice.turnOn();
        genericDevice.turnOff();
        System.out.println("_________________________________________________________________________");

        // Creating as instance of the WearableDevice
        WearableDevice fitnessBand = new WearableDevice("FitBand",10,"Silicon");
        fitnessBand.turnOn();// turn on method is inherited from SmartDevice class
        fitnessBand.wear();// This is a special behavior specifit to WearableDevices Objects.
        fitnessBand.turnOff();// turn off method is inherited from SmartDevice class
        System.out.println("_________________________________________________________________________");
        SmartWatch appleWatch = new SmartWatch("Apple",18,"Leather",true);
        appleWatch.turnOn();// turn on method is inherited from SmartDevice class
        appleWatch.wear();// This is a special behavior specifit to WearableDevices Objects.
        appleWatch.turnOff();// turn off method is inherited from SmartDevice class
        appleWatch.heartRateCheck();// This method is specific to SmartWatches.
        System.out.println("_________________________________________________________________________");
    // Is-A relationship in Java
            //Is SmartWatch a SmartDevice (Based of our implementation)// yes
            //Is SmartWatch is WearableDevice ( Based of our implementation)// yes
            //Is SmartDevice a WearableDevice

    // This relationship will help us understand polymorphism in Java.
    // 3rd concept of OOP.


    }
}
