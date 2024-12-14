# Logical Operators in Java

| Operator    | Symbol | Description                                                              |
|-------------|--------|--------------------------------------------------------------------------|
| Logical AND | `&&`   | Returns `true` if **both** conditions are true                           |
| Logical OR  | `\|\|` | Returns `true` if **at least one** condition is true                     |
| Logical NOT | `!`    | **Negates** the boolean value (inverts `true` to `false` and vice versa) |

## Logical Negation `!`
* The `!` operator negates or invers the value of a boolean. If the value is `true`, `!` make it `false`, and vice versa.
```java
boolean isRaining = true;
boolean canGoOutside = !isRaining;// Negates isRaining

System.out.println(canGoOutside);// Output: false since the isRaining variable is true.

```

##Logical And `&&`
* Such as to travel I need a passport and visa
    Passport            Visa            Travel
        +                -             false(no)
        -                +             false (no)
        +                +             true(yes)
        -                -             false(no)

* Such as to travel I need a passport and visa and money
  Passport            Visa       Money             Travel
    +                  +           -               false(no)
    +                  _           +               false (no)
    -                  +           +               false(no)
    +                  +           +               true(yes)

- The `&&` operator evaluates to `true` only if **all** conditions in the expression are `true`.
If any of the operand is `false` the result is `false`.
```java
// In order to enter a club, the customer needs to be over 21 and should have the ticket and partner.
boolnea hasParter = false;
int age = 22;
boolean hasTicket = true;
bolean canEnter = (age >= 21) && hasTicket;// Both must be true
System.out.prinln(canEnter);// Output: true since both conditions given were true.
```

## Logical or `||`
* The `||` operator evaluates to `true` if at least **one** of the operand is `true`.
I would like to buy computer from the store. The store accepts Credit Card of Cash.
* Useful when only one of several conditions need to be met.

 CC             Cash                   CanIBuy
 +               -                      true
 -               +                      true
 +               +                      true
 -               -                      false(

 CC             Cash     Paypal              CanIBuy
 +               -         -                     true                      
 -               +          -                    true           
 +               +          +                    true            
 -               -         -                      false  
// I could get a rest if it is weekend or if it is holiday or if the kids at grandparets.
```java
boolean isWeekend = false;
boolean isHoliday = false;
boolean kidsAtGrandP = false;

boolean canRelax = isWeekend || isHoliday || kidsAtGrandP;
// the value of can relax is false since none of three given conditions was true.
```

###Summary:
*** Logical and `&&` **: requires all conditions to be true.
*** Logical or `||` ** requires at least one of the conditions to be true.
*** Logical Not `!` ** inverts a boolean value.

### Note!
- If `&&` operator and `||` operator is used in same operation, `&&` operator will be calculated before `||` operator.

# If Statement
* If statement is a conditional stamenet used to execute a block of code only if a specific conditon is `true`.
It's a fudamental tool for decision making, allowing programmers to control the flow of program based on difference conditions.
```java
if (condition){
    //inside of an if statement
        }
```
* **Note**: Code inside the curly braces could also be reffered as a block of code.
```java
public clas test{
    public static void main(String[] args) {
   // If the person can buy the product let's print you could buy the product
   double userMoney = 2349.12;
   double theProductPrice = 110;// tax included
        // Can user buy the product
        boolean canBuy = userMoney > theProductPrice;
        // The condition above will be true when the user has enough monet to buy product, false otherwise.
        if(canBuy){
            System.out.println("Yes you could buy the product. ");
        }
        // If the variable canBuy is false, the code inside the if block won't be executed therefore , there will not be any output displayed.
}
        }
```

# If...Else Statement
* If ... Else statement allows programers to specify and **alternative block of code** to execute when the previous **condition is false**
* Syntax of
```declarative
if (condition) {
    //Code to execute when the condtion is true
}esle{
    //Code execute if the previous condition is false
}
//Always only on of the blocks is executed.
```
* Example

```java
public class test{
    public static void main(String[] args) {
        //If the weather outside is hotter thatn 85 print It's hot outside.
        //otherwise print the wheater is pleasant.
        int temperature = 84;
        if (temperature > 85) {
            System.out.println("It's hot outside");
        }esle{
            //This block of code will only be executed when the temperature is not above 85.
            System.out.println("Weather is pleasant");
        }
    }
}
```
# Else if Statement
* Else if Statement is useful when there is multiple condtions to check. You can add as many `else if ` conditions as needed.
In a if statement with multiple `else if` , the first condtion what evaluates to `true` will execute, and the rest will bi ignored.
*Syntax
```java
    if (condition1){
// Code to execute whne condtion1 is true
    }else if {(condition2){
//Code to execute if condition2 is true
    }esle{
//Code to execute if none of the above codntions are true.
}
```

```java
public class question{
    public static void main(String[] args) {
        if (true){
            System.out.println("1");
        }
        esle if(false){
            System.out.println("2");
        }
        else if(true){
            System.out.println("3");
        }
        esle if(true){
            System.out.println("4");
        }
        else{
            System.out.println("5");
        }
            // The output of the code above is only "1" because when we encouter a true statement rest of the conditions are ignored.
    }
}
```