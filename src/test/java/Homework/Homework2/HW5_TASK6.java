package Homework.Homework2;

import java.util.Scanner;

public class HW5_TASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int userAge = scanner.nextInt();
        System.out.println("Please enter your anual income");
        int anualIncome = scanner.nextInt();
        System.out.println("Please enter your credit score");
        int crediScore = scanner.nextInt();
        System.out.println("Please enter if you have a cosigner (true for yes, false for no)");
        boolean cosigner = scanner.nextBoolean();
        boolean calculation = (anualIncome >= 30000 || crediScore >= 700) ;
        if (crediScore < 700 ) {
            System.out.println("Loan requires a cosigner");
        } else if (userAge <= 21 || 65 <= userAge ) {
            System.out.println("You do not meet the age requirements. ");
        } else if (anualIncome < 30000 ) {
            System.out.println("You do not meet income criteria. ");
        } else if (calculation) {
            System.out.println("Loan approved");
        }
    }
}
