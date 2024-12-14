package Homework.Homework2;

import java.util.Scanner;

public class HW4_TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimalAmount = 50;
        System.out.println("Please enter the order amount: ");
        double orderAmount = scanner.nextDouble();
        System.out.println("Are you a premium member: ");
        boolean isPremiumMember = scanner.nextBoolean();
        System.out.println("Do you have any restricted items: (false for no), (true for yes)");
        boolean hasRestrictedItem = scanner.nextBoolean();
        boolean orderMinimum = (isPremiumMember || orderAmount >= minimalAmount) && !hasRestrictedItem ;

        System.out.println("Print true if order is eligible for free delivery, otherwise print false. " + orderMinimum);
    }
}
