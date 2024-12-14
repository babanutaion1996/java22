package Homework.Homework2;

import java.util.Scanner;

public class HW5_TASK5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature in celsius: ");
        int tempInput = scanner.nextInt();
        if (tempInput < 0) {
            System.out.println("Freezing temperatures");
        } else if (tempInput  >= 0 && tempInput < 10) {
            System.out.println("Very cold weather");
        } else if (tempInput >= 10 && tempInput < 20) {
            System.out.println("Normal temperature");
        } else if (tempInput >= 30 && tempInput < 40) {
            System.out.println("It's Hot");
        } else if (tempInput >= 40 ) {
            System.out.println("It's Very Hot");
        }
    }
}
