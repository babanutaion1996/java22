package Homework.Homework2;

import java.util.Scanner;

public class HW4_TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        int minimalAge = 18;
        int overage = 21;
        System.out.println("Do you have a parental consent (true/false)");
        boolean hasConsent = scanner.nextBoolean();
        boolean canAttendCinema = (age >= minimalAge && (age >= overage || hasConsent )) ;
        System.out.println("Can watch the movie : " + canAttendCinema );

    }
}
