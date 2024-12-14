package Homework.Homework2;

import java.util.Scanner;

public class HW3_TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        int firstN = scanner.nextInt();
        int secondN = scanner.nextInt();
        int thirdN = scanner.nextInt();
        int squareFirst = firstN * firstN , squareSecond = secondN * secondN, squareThird = thirdN * thirdN;
        int sumCalculation = squareFirst + squareSecond + squareThird;
        System.out.println("Sqaure of first number:" + squareFirst );
        System.out.println("Sqaure of second number:" + squareSecond );
        System.out.println("Sqaure of  third number:" + squareThird );
        System.out.println("Sum of the numbers :  "+ sumCalculation);
    }
}
