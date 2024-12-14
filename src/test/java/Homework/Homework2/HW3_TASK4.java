package Homework.Homework2;

import java.util.Scanner;

public class HW3_TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 integral numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        boolean result = (firstNumber  == secondNumber) && (secondNumber ==  thirdNumber) ;
        System.out.println("The result is: " + result);

    }
}
