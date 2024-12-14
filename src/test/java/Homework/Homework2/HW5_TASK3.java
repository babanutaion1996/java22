package Homework.Homework2;

import java.util.Scanner;

public class HW5_TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter electricity usage :");
        double usage = scanner.nextDouble();
        if ( usage < 100) {
            System.out.println("Your total bill amount is: " + usage * 0.50);
        } else if (usage  >= 101 && usage < 300) {
            System.out.println("Your total bill amount is: "+ usage * 0.75);
        } else if (usage >= 301 && usage < 500) {
            System.out.println("Your total bill amount is: "+ usage * 1.20);
        } else if (usage > 500) {
            System.out.println("Your total bill amount is: "+ usage * 1.50);
        }
    }
}
