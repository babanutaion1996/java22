# Method Overriding
* Method overriding occurs when a **child/sub** class provides it's own specific implementation for a method that is already
defined in it's **parent/super** class.
* This method in the child/sub class **must** have the **same name, same parameters** and **same return type**
as the method in the parent class.
* The access modifier should be more **lenient**(**accesible**) or **same** in the child /sub class
* To make overriding easy `@Override` annotation. When `@Override` annotation used, it will complain if we are not
properly overriding, However, without using this annotation there is nos specific way to now.
`@Override` annotation is **not require** to override methods.

## Rules of Overriding
1. *Access Modifiers**
        * Overriding method cannot have more restrictive access modifiers than the method in parent class.
2. *Return Type**
        * **Must** be same *OR* **covariant return type**(a subclass of the return type in parent class) 
3. **Anotations**
        * It is best practice to use `@Override` annotation. This ensures the method is properly overriding a parent method.
4.  **Exceptions**
        * The overriding method cannot throw more checked exception than the parent method.
        * We will cover exceptions later.

## What Can't be Overriden?
1. Static Methods
    *Whe a static method is tried to be overriden, it is called method hiding.
2. Final Methods (We will cover later.)
3. Private Methods Cannot be Overriden (Because private methods and variables are not inherited.)
4. Constructors

## access modifiers frm most restricted to least restricted(least accesible to most accesible)
* private -> default -> protected -> public

# Polymorphism
* 1 of the 4 conceptS of OOP
* PolyMorphism -> means Many(Poly) Forms(Morphism)
* In Java, polymorphism allows a single method name to behave differently based on the object is its called upon.
* **There are 2 type of Polymorphism in Java** 
    1.**Compile-Time PolyMorphism(Method Overloading)**
            * Happens when methods with same name exists in the same class but have different set of parameters.
            * The method to execute is decided at compile time
    2. **Runtime Polymorphism(Method Overriding)**
            * Happens when a child class overrides a method of its parent class.
            * The method to execute is decided at runtime based on the actual type of object.