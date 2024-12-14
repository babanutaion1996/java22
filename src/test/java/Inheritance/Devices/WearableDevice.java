package Inheritance.Devices;
//child
public class WearableDevice  extends SmartDevice{
    String strapMaterial; // Every wearable device object, should have a strap material

    // Create a constructor that matches, super/parent classes constructor
    public WearableDevice(String brand, int batteryLife,String strapMaterial){
        // I would like to call constructor from the super/parent class.
        super(brand,batteryLife);
        this.strapMaterial = strapMaterial;
    }

    @Override
    void turnOn(){
        System.out.println("Please wait Wearable Device to Load");
        System.out.println("Wearable mdevice is turning on");
        System.out.println("This turn on method is from WearableDevice class.");
    }

    void wear(){
        System.out.println("You are wearing a " + brand + " devices with a " + strapMaterial + " strap.");
    }

}
