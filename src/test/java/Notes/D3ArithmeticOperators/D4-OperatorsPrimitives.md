# Char Data Type
- In java a 'char' is a short for 'character' 
- This primitive data type is used to store single data character.
- Unlike other data type 'char' can only hold single character.
- Size of this data type is 16-bit.

```java
char letter = 'T';
char num = '5';
char symbol = '&';
```
## Is 'char' still used
* ** Less common Today **: It is still part of JAVA, howere it is not neccesary for modern applications,
- Nowadays string(text type) are more popular because it can hold mutiple characters and more versatile.
## Why the 'char' data type created?
* When Java was first created, 'memory resources were very limited', and it was efficient to store a single character as a 'char' data type, which took 
only 16 bits(2byte).

## HOW is char related to ASCII and Unicode?
1. ASCII(American Standart Code for Infomation Interchange)
    * ASCII is a 7-bit character encoding stadart that represents 128 characters, including leters, digits and special symbols.
    * Each 'char' in Java can represent characters from the ASCII table. For example 'A' has an ASCII value of '65'.
    and a lower case 'a' has a value of 97.
2.Unicode
    * Java char is based on 'Unicode', which is more comprehensive version of ASCII table.
    * Unlike ASCII, which is limited to 128 characters, Unicode supports 143000 characters, including symbols, emojis...
   
** NOTE!** 'char' data type can be assigned with numerical value or can be assigned with a value withing single quatation. ' '' '
When 'char' data type is assigned with a numerical value it finds the matching numerical value from 'Unicode' or 'ASCII' 
table and then assigns itself with that character.
```java
char ch = 122;
System.out.println(ch);// This line will print letter 'z'.
```



# Declaration, Initialization, Assignement, Reassigment, and Compound Assignment Operator.
1. 'Declaration'
   * Declaration is assigning data type to a variable.
```java
public class Test{
   public static void main(String[] args) {
       int var;
       double number;
       char c1;
       long l2;
       // All of the above is an example to declaration in Java programming.
       // These are called decalring a variable.
   }}
```
2. 'Initialization'
    * Initialization is assigning value to a variable.
```java
public class Test{
   public static void main(String[] args) {
       int var;
       double number;
       char c1;
       long l2;
       // We are goint to initialize the declared variables above.
       var = 10;
       number = 17.9;
       c1 = '!';
       l2 = 4343434343443L;
       // Variables are inititialized above.
   }}
```
3. 'Assignment, Reassignment.'
- The assignment operator '=' is used to store a value in a variable, It assigns the value on the right side fo the operator to the variable on the left.
```java
int number = 6;// Variable number is assigned with the value 6.
int num1;
num1 = 8; // Variable is assigned with value 8. Initialized the num1 with value 8.
```
-Reassignment is when we change the value of a variable after the frist initialization 
```java
public class reassignment {

    public static void main(String[] args) {
        double d1 = 7;
        System.out.println(d1);//7
        d1 = 19.8; // d1 is reassigned with value 19.8
        System.out.println(d1);//19.8

        d1 = d1 + d1 + .4;
        System.out.println(d1);// Result is 40.0
        
        d1 = 'y';
        System.out.println(d1);
        // The output will be 121.0
        // Since the char type has a numerical value, it assigns double data type with it's numerical value.
        
        int num1 = 11;
        
        num1 = num1 + 4.0; // The compile time error
        System.out.println(num1);
        // We cannot change the data type when reassigning.
        
    }
}
```

4. 'Compound Reassignment Operators'
- Compound assignment operators are a shorter way of writing expressions where a variable is modified and then assigned with a new value.
  1. '+='
    - This operator will add and then reassign.
    - 'x += 5' is a ' x = x + 5'
  2.'-='
    - This operator will substract and then reassign.
    - 'var -=10' is 'var = var - 10'
  3'*='
    - This operator will multiply and then reassign.
      - 'x *= 5' is a ' x = x * 5'
  4.'/='
    - This operator will divide and then reassign.
    - 'var /=10' is 'var = var / 10'
  5.'%='
    - This operator will find remainder and then reassign
    - 'var %=3' is 'var = var %3 '
  
# Casting in Java with Primitives

## What is Casting?
**Casting** is the process of **converting one data type into another**. In Java, it is often used when you need to change the type of a variable to perform operations or to store a value in a specific format. Casting is particularly relevant for **primitive data types** like `int`, `float`, `double`, `char`, and others.

### Why Do We Need Casting?
- **Memory Optimization**: Sometimes, you may need to convert a larger data type (e.g., `double`) into a smaller one (e.g., `int`) to save memory or to match the expected data type in certain operations.
- **Type Compatibility**: Casting is essential when you need to perform operations between different types, like dividing two `int` values but needing the result as a `double`.
- **Less Needed Today**: While casting is still important, modern Java often uses higher-level classes that handle type conversions automatically, making explicit casting less frequent compared to older programming practices.

## Types of Casting: Implicit and Explicit

### 1. Implicit Casting (Widening)
- **Definition**: Implicit casting occurs automatically when you convert a **smaller data type to a larger data type**. Java does this without requiring any special syntax because there is no risk of losing data.
- **When It Happens**: From `byte` to `short`, `short` to `int`, `int` to `long`, `float` to `double`, etc.
- **Easy Way to Memorize**: You can remember this as **"small to big is safe"**. Java handles it automatically because no information is lost in this conversion.
- **Example**:
  ```java
  int num = 100;
  double result = num; // Implicit casting from int to double
  System.out.println(result); // Output: 100.0
  ```

### 2. Explicit Casting (Narrowing)
- **Definition**: Explicit casting is needed when converting a **larger data type to a smaller data type**. You must specify this in your code because there is a risk of losing data, or the conversion might not be exact.
- **When It Happens**: From `double` to `float`, `long` to `int`, `int` to `short`, `short` to `byte`, etc.
- **Easy Way to Memorize**: Think of this as **"big to small requires permission"**. You need to explicitly tell Java to perform this conversion.
- **Example**:
  ```java
  double price = 9.99;
  int roundedPrice = (int) price; // Explicit casting from double to int
  System.out.println(roundedPrice); // Output: 9
  ```

### Examples of Casting Scenarios:
1. **From `int` to `double` (Implicit)**
   ```java
   int wholeNumber = 7;
   double preciseValue = wholeNumber; // Automatically converted to 7.0
   ```
2. **From `double` to `int` (Explicit)**
   ```java
   double largeValue = 15.75;
   int simpleValue = (int) largeValue; // Must be explicitly casted
   ```

### Summary:
- **Implicit Casting**: Happens automatically, used when converting smaller to larger types. Example: `int` to `double`.
- **Explicit Casting**: Requires manual casting, used when converting larger to smaller types. Example: `double` to `int`.
- **Rule of Thumb**: Java allows widening (small to big) automatically, but narrowing (big to small) needs explicit permission to prevent accidental data loss.

Understanding when to use implicit or explicit casting ensures that your code works correctly and helps avoid unexpected behavior, especially when dealing with numerical calculations.







