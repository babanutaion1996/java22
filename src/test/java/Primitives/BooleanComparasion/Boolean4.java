package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        /**/ // /**/ -> symbol is used to commenting out everything in between them.
        /* Create a program that asks user to enter their 3 exam results.
        Find the average of 3 exam result with decimal points.
        Passing grade for the exam is 75. If users passes print true, false is users fails.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your exam results 1");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your exam results 2");
        int number2 = scanner.nextInt();
        System.out.println("Please enter your exam results 3");
        int number3 = scanner.nextInt();
        double calculation =  (number1 + number2 + number3)/3.0 ;// Find average sum off all the exams
        boolean isEven = calculation >= 7.5;
        System.out.println("True if passed false if falied " + isEven + " " + calculation);
        // Note: Division of any numerical primitive type other that float,double will calculate the result without the decimal point
        // So if we want to get decimal point out of division we have to use double or float somewhere in the operation.
    }
}
