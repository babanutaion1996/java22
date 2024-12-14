# Methods
## Componenets of a Method
1. Access Modifiers
2. Return type
3. Method Name
4. Parameters

###
1.**Access Modififers**
    * Define the visibility or scope of a method(Where you could access the method)
    * Access Modifiers in java
        * public: Accessible from anywhere in the program(project).
        * private: Accessible **only** withing the same class.
        * protected: Accessible within the same package and subclasses.
        * **Default(No modifier)**: Accessible withing the same package only.

* Example
```java
    public void display(){ // Public
    System.out.println("This is public method");
}

    void calculate(){ // Default(No Modifier)
        System.out.println("This is has a default access modifier");
    }
    
    private void print(){
        System.out.println("This method is a private method");
    }
    
    protected void find(){
        System.out.println("This method is protected");
    }
    
```
* **Note**: Access modifiers could also be used with **instance variable**.

2. **Return Type**
    * The return type specifies the type of value a method will return.(e.g, int,String,void.)
    `void` means method doesn't return any value.

```java
    public int add(int a, int b){
    return a + b;// This method return an integer value. Which is the sum of given 2 parameters.
}

    public void great(){
        System.out.println("Hello");// We have printed, but we didn't return any value from this method.
    }

```

3.**MethodName**
    * Name the methods as you are naming a variable.

4. **Parameters**
    * Parameters allow you to pass data into a method.
    * Defined within parentheses and specify the type fo data the method expects.
```java
public void greet (String name){

    System.out.println("Hello" + name + "~");
}
```
## Method Overloading
* Allows multiple methods in th same class to have the same name but different set of parameters.
* For methods, combination of a method name and parameters are called methods signature.

```java
public class example{
    public void greet(){
        System.out.println("Hello all!");
        // Method signature above is  greet()
    }
    public void greet(String name) {
        System.out.println("Hello" + name);
        // Method signature above is greet(String name)
    }
    // NOTE! greet method is the example class is overloaded.
}
```

# Constructor
* Constructor is a special method in a class used to initialize objects.
* It has the same name as the class and no return type.
* Constructors are automatically called when an object is created.
* Every class in Java has a constructor. If a constructor is not created explicitly Java creates default constructor for the class.
```java
public class Cat{
    public Cat(){
        //Constructor of the cat class and it will be called any time an object is created from a class.
        System.out.println("Constructor is called");
    }
}

public static void main(String[] args) {
    Cat cat = new Cat();
    // Output of this code when I Run.
    // Constructor is called.
}


```
# Example Of Not Returning
```java
class Test{
    public int value(){
        System.out.println("Print something");
    }
    // What happens when this class is executed?
    // When a method return type ie not void, you are guarenteeing that your method will return a value.
    // However by not returning a value you are not keeping your promise. So ajva doesn't compile
}


```