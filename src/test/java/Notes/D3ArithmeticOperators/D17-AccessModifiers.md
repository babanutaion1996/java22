# Access Modifiers
1. `public` **Access Modifier**
* **Scope**: Accesible anywhere in the program
  * The same class
  * Sublasses or different packages.
  * Non-subclass in different or same package.
* **Usage**: Use `public` for methods of variables that need to be universally accessible.
```java
public class Test{// This class is accesible anywhere in the program
    public String publicMessage = "This can be accessed from anywhere!"
    public void testMethod(){
        // This method is also accesible anywhere in the program.
    }
}
```

2.`protected` **Access Modifier**
* **Scope**: Accessible within the same package and **subclasses** in other packages.
* **Usage**: Use `protected` for members that should be used in subclasses but not in unrelated packages.
```java
public class Test{// This class is accesible anywhere in the program
    protected String publicMessage = "This can be accesed from same package or subclasses.!"
    protected void testMethod(){
        // This method is also accesible in same package or subclasses.
    }
}
```


3. **Default(No modifier)**
* **Scope**: Accesible only withing the same package.
* **Usage**: Use default access modifier for package private behavior when the class is part of tighly coupled package.
```java
public class Test{// This class is accesible anywhere in the program
    String publicMessage = "This can be accesed from same class only!"
            
    void testMethod(){
        // This method is also accesible in same package only.
    }
}
```

4. `private` **Access Modifier**
* **Scope**: Accessible **only** within the same class. Not even subclasses can access it.
* **Usage**: Use `private` to **encapsulate** details that shoudn't be exposed outside the class.
* (e.g., sensitive data,sensitive logic etc.)
```java
public class Test{// This class is accesible anywhere in the program
    private String publicMessage = "This can be accesed from same class only!"
    private void testMethod(){
        // This method is also accesible in same class only.
    }
}
```
| **Modifier**  | **Class** | **Same Package** | **Subclass (Different Package)** | **Other Package** |
|---------------|-----------|------------------|----------------------------------|-------------------|
| **Public**    | ✔️         | ✔️                | ✔️                                | ✔️                 |
| **Private**   | ✔️         | ❌                | ❌                                | ❌                 |
| **Protected** | ✔️         | ✔️                | ✔️                                | ❌                 |
| **Default**   | ✔️         | ✔️                | ❌                                | ❌                 |

# OOP Concepts
## 1. Encapsulation
* Encapsulation is one of the four fundamental principles of **Object-Oriented Programming (OOP)**.
* Encapsulation is process of  **hiding implementation details** and **protecting the data** by restricting direct access to the variables.
* It allows controlled access to data using **getter** and **setter**  method.
* **Key Features of Encapsulation**
 1.**Data Hiding**
    * Encapsulation hides the internal state of the object from outside the world
    * Field(Instance Variable) are declared as `private` to prevent direct access.
2. **Controlled Access**
    * Public methods(`getters` and `setters`) provide controlled access to private variables.
    * Allows validation or additional logic when getting or setting variables values.
3. **Improved Code Maitenance**
    * Only the logic of `getters` and `setters` needs to be updated.
4. **Security**
    * Encapsulation provides better control over data integrity by validating data before modification.
* ** How to Achieve Encapsulation in Java?**
  1. **Declare variable as `private`**
      * This restrict access to the variables.
  2. ** Provide public `getter` and `setter` methods**:
      * Getters will retrieve the value.
      * Setters will update the variables value, often with validation logic.
     
## 2. Inheritance
* Inheritance is one of the 4 fundamental concepts of OOP. Allows a class to acquire properties and behaviors of another class.
It is a mechanism to create a new class(child|sub) class based on a existing (parent|super).
* To achive inheritance in `Java` we use `extends` keyword.
* The child class can:
    * Inherit field an methods for the parent class.
    * Add its own fields and methods.
    * Override methods to provide specific implementation. (***)
```java
    class Parent{
    
}

class Child extends Parent {
    // child class code, this class inherits every behavior of the parent class expect the private ones.
}
```
* **What are the benefits of inheritance?**
    1. **Code Reusability**
    2. **Extensibility**
        * Child(sub) class can extend the behavior of the parent clas by adding new field of merhods.
    3. **Polymorphism** -> It'll be expalained as 3rd conecpt of OOP.
    4. **Easy Maitenance**

* **Why inheritance?**
- Inheritance allows us to model real-world hierarchies and relationships. It's simplifies the code by establishing a relationship
between general and specific classes.
- **For example** A vehicle class(parent) can have common properties like `speed`, and methods like `start()`.
Specific types of vehicle like `Car` and `Bike` (child|sub classes) can inherit these properties and add their own features.

* **Limitations of Inheritance**
    1. **No multiple inheritance of Classes**
        - Java doesn't support multiple inheritance.(a class inheriting more than one parent)
        - Java uses **Interfaces** for multiple inheritance. Interfaces -> Abstraction -> 4th concept of OOP.
    2. **Tigh Coupling**
        - Inheritance introduces a strong dependecu between the parent and child classes, which may make
       code harder to refactor.
    3. **Complexity**