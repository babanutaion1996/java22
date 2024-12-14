package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {


        // Note that value of integer variable number is going to come from user.
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number to see if it odd od even ");
        int number = scanner.nextInt();
        // Even number are perfectly divisisble by 2.
        // If a number is perfectly divisible by other number there would'nt be any remainder.
        // If the number gives no remainder with 2, it means that number is even number.

        int remainderWith2 =  number % 2;
        // If the remainder with 2 equals 0, it means even number.
        boolean isEven = remainderWith2 == 0;
        // If no remainder with 2, isEven will be true. If there is a remainder isEven will be false.
        // So printing out the variable isEven will give me the answer of the question.
        System.out.println("Is the given number even?" + isEven);





    }
}
