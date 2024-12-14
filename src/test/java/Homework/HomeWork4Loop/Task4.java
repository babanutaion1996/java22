package Homework.HomeWork4Loop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please introduce the number");
        int number = scanner.nextInt();

        for (int i = 1; i <= number ; i++) {
            int sqaure = i * i;
            System.out.println(sqaure + "");
            sum += sqaure;

        }
        System.out.println("The sum off all the numbers is: "  + sum);




    }
}
