package ClassObjectMethod;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // Let's create a public method that will take 2 double numbers as parameters.
    // This method will return the sum of numbers as double.
    // Name of the method will findSum.
    // Create a main method bellow is this class and test your method
    public double findSum (double number, double number2){

        return number + number2;
    }
    // What if I want to create a method fo findSum off all the values in  a list.
    public int findSum(List<Integer> nums){
        // We are already given a list of integer values.
        int sum = 0;
        for (int element : nums){
            sum += element;
        }
        return sum;
    }
    // In this class we have overload findSum method.
    // There is 2 ways to use findSum method.
    // If we give 2 double values for find sum method it will return sum of 2 doubles as a double value
    // If we give List<Integer> to findSum method, it will return sum of all the values in the list as an integer.


    // Let's create a public method that will take sigle int value and will return the square of the given integer. Name of the method square.

    public int square(int num){
        return num * num;
    }



    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       double a = 11.5;
       double b = 0.5;
       calculator.findSum(a,b);
        System.out.println(calculator.findSum(a,b));

        // calculator.square(a);// Won't compile, as square method strictly expects an integer value to be passed.

        System.out.println( calculator.square(4));
        System.out.println(calculator.findSum(3.2,2.9));
        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(10);
        number.add(11);
        number.add(56);
        System.out.println(calculator.findSum(number));
        // findSum method is overloaded in calculator class.
        // To overload any method, use the same method name in the class with the different parameters.

        // From any of the object type that we learned (List and String)
        // give me a method example that is overloaded.

        String test = "doesn't matter";
        test.substring(1);
        test.substring(1,3);

        test.replace('o','n');
        test.replace("doesn't","does");

        // Same class, Same method name, different parameters.
        // Difference could be number of parameters, data type of parameters.
    }


}