package Homework.HomeWork4Loop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        long factorialStart = 1;
        System.out.println("Please input the number");
        Scanner scanner = new Scanner(System.in);
        int lineNumber = scanner.nextInt();
        for (int i = 1; i <= lineNumber ; i++) {
            factorialStart *= i;

        }
        System.out.println("The factorial of " + lineNumber + "is: " + factorialStart);

    }
}
