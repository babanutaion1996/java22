package Homework.HomeWork4Loop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scanner.nextInt();
        int sum = 0;
        int multiplication = 1;
        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i)); // Convert character to integer
            multiplication *= digit; // Multiply the digit
            sum += digit; // Add the digit
        }

int productNumber = multiplication - sum;
        System.out.println("result" + productNumber);

    }



}
