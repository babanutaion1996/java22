# Static
- `static` keyword,makes methods/object belong tot a class.
## Static Variable
* A static variable belong tot the class, not to any specific object.
* It is shared among all instances(objects) of the class
*  ** Key Points**
    * Declared using the `static` keyword.
    * Memory is allocated once the class is loaded.
    * Can be accessed using the **class name** (e.g., `ClassName.variableNmae`).
    * Useful for constants or data shared across all objects.]
   
## Non-Static Variable
* Non-Static variable belongs to a specified object.
* Each object has its own copy of the variable.
* **Key Points**
    * Declared without `static` keyword
    * Memory is allocated once the object is created.
    * **Can ONLY** be accessed using a object of the class. (e.g., `objectName.variableName`)
    * Useful for storing data unique to each object.

## Static Methods
* Usually used for creating common logic that will effect all objects.
* If you want to be able to use method without creating an object then you can make it static.
* In static methods, you cannot call non-static instance variables.

## Non Static Methods
* Used for logics that will effect each object .
* It could access both `static` and `non-static` variables.
* To call this methods we must create object.

## Static Blocks
```java
public class Example{
    static{
        this is static block
     }
  }
```
* Executes once the class is loaded
* Used for initializing static variables or performin one-time setup
* Cannot access non-static variables or method.

## Non-Static Blocks
```java
public class Example{
    // thi sis a nno-static block in java
}
```
* Executes every time an object is created
* Used for common initialization task across all constructors.
* Can access both static and non-static variables and methods.


## Execution Order in the Class
1. Static Block.
2. Non-Static block
3. Constructor