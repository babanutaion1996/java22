# MultiLevel Inheritance
* `SmartDevice` is the parent class
* `WearableDevice` extends `SmartDevice` class.
* `SmartWatch` class extends the `WearebleDevice`


## Requirements
1. ** Class1: SmartDevice**
    *Atributes*
        *   `brand`: The brand of the device
        *   `batteryLife`: The device's battery life in hours.
    * *Methods(Behaviors)*
        *   `turnOn()`: Print a message indicating the device is turning on.
        *   `turnOff()`: Print a message indicating the device is turninf off.
        *    `static deviceInfo`: Print general message about
      
2.  ** Class2 : Wearable Device**
    * *Attributes*
        *   `strapMaterial`: Material of the wearable strap
    * *Additional/Behavior*
        *   `wear()`: Print a message that devices is being worn.
      
3.  **Class3 SmartWatch**
    * Inherits all attributes and methods from `Wearable Device Class`
    *  *Additional Attributes*
            * `heartRateMonitor` : Boolean value indicating whether the watch has a heart rate monitor or not.
    *  *Additional Methods*
            * `checkHeartrate`: Print message simmualtisn hearrate check fi the smart has one.
    