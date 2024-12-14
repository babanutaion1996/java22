package Homework.HomeWork5List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> months = new ArrayList<>();
        List<Integer> totalExpenses = new ArrayList<>();

        System.out.print("How many months of expenses would you like to enter? ");
        int numMonths = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left from nextInt()

        for (int i = 0; i < numMonths; i++) {
            System.out.print("Please enter the name of the month: ");
            String userMonth = scanner.nextLine();
            months.add(userMonth);

            System.out.print("Enter the total expenses for " + userMonth + ": ");
            int amount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left from nextInt()
            totalExpenses.add(amount);
        }

        // Calculate the total and average expenses
        int total = 0;
        for (int expense : totalExpenses) {
            total += expense;
        }
        double average = (double) total / totalExpenses.size();

        System.out.println("Summary:");
        System.out.println("Average monthly expenses: " + average);

        // Display months with expenses above the average
        System.out.println("Months with expenses above the average:");
        for (int i = 0; i < months.size(); i++) {
            if (totalExpenses.get(i) > average) {
                System.out.println(months.get(i) + ": " + totalExpenses.get(i));
            }
        }

    }
}