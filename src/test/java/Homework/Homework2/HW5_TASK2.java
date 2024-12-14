package Homework.Homework2;

import java.util.Scanner;

public class HW5_TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your daily steps: ");
        int stepsMin = scanner.nextInt();
        if (stepsMin < 5000) {
            System.out.println("At least 5000 steps are mandatory per day.");
        } else if (stepsMin  >= 5000 && stepsMin < 10000) {
            System.out.println("Moderate activity");
        } else if (stepsMin >= 10000 && stepsMin < 15000) {
            System.out.println("High activity");
        } else if (stepsMin > 15000) {
            System.out.println("Intense activity");
        }
    }
}
