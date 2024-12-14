# Class & Object

## What is a class?
* A Class is blueprint for creating a object in Java, It defines properties(variable) and behaviors(methods)
* that the object of the class will have.
* Think of a class as a template. For example , a 'Car' class might defines attributes like 'color', 'model', and behaviors like 'drive()' or 'stop()'

## What is an Object?
* An object is an instance of a class. When you create an object, you are bringing the blueprint(class) to life
* Each object can have its own value for the attributes defined in the class.

### Example
```java
class Car{
    String color;// Attribute (Property of the class) (Class Variable)
    void drive(){ // Method for the Car class(behavior of the object)
        System.out.println("The car is driving.");
    }
    
}

public class TestCars{
    public static void main(String[] args) {
     Car myCar = new Car();
     myCar.color = "Black";
     // Now the color of myCar object is Black
     Car youCar = new Car();
     youCar.color = "Red";
        System.out.println(myCar.color);//Black
        System.out.println(youCar.color);//Red
    }
}

```