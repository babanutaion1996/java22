package Homework.Homework2;

import java.util.Scanner;

public class HW5_TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int userAge = scanner.nextInt();
        if (userAge < 13) {
            System.out.println("G rated movies available for your are.");
        } else if (userAge  >= 13 && userAge < 17) {
            System.out.println("PG-13 movie availble for your age");
        } else if (userAge >= 17 && userAge < 21) {
            System.out.println("R-rated movies available under your age");
        } else if (userAge >= 21) {
            System.out.println("All library is available for your age");
        }
    }
}
