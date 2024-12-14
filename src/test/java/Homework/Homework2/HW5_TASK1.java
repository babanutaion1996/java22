package Homework.Homework2;

import java.util.Scanner;

public class HW5_TASK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input water usage: ");
        int waterUsage = scanner.nextInt();
        if (waterUsage < 2000) {
            System.out.println("Congratulations for low water usage for current month.");
        } else if (waterUsage >= 2000 && waterUsage <= 3000) {
            System.out.println("You water usage this month is between normal range, Thank you.");
        } else if (waterUsage >= 3000 && waterUsage <= 4000) {
            System.out.println("Dear consumer we advise you to conserve water, Thank you. ");
        } else if (waterUsage > 4000) {
            System.out.println("You'll be fined if you use more water. ");
        }
    }
}
