package Homework.HomeWork5List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();

        // Step 2: Allow the user to enter grades dynamically
        System.out.println("Enter grades one by one. Type -1 to stop.");
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) { // Sentinel value to stop input
                break;
            }
            grades.add(grade);
        }

        // Step 3: Display current grades
        System.out.println("\nCurrent grades: " + grades);

        // Step 4: Allow the user to update a specific grade
        System.out.print("Enter the index of the grade to update: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < grades.size()) { // Validate index
            System.out.print("Enter the new grade: ");
            int newGrade = scanner.nextInt();
            grades.set(index, newGrade); // Update the grade

            // Step 5: Display updated grades
            System.out.println("Updated grades: " + grades);
        } else {
            System.out.println("Invalid index. No changes made.");
        }
    }
}