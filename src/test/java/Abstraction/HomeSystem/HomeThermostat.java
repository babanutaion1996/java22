package Abstraction.HomeSystem;

public class HomeThermostat implements SmartHomeDevice {
    private boolean isOn;
    private int currentTemperature;

    public HomeThermostat() {
        this.isOn = false;
        this.currentTemperature = 70;// current temperature value
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat is OFF");
    }

    @Override
    public void deviceStatus() {
        if (isOn) {
            System.out.println("The thermostat is ON.");
        } else {
            System.out.println("The thermostat is OFF.");
        }
    }
}
