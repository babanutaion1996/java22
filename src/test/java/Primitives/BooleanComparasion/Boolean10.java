package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year ");
        int year = scanner.nextInt();
        //If the year is divisible by 400 -> noo need to look other conditions is is a leap year.
        // However, if it is divisible by 4 then we have to make sure it is not divisible by 100.
        boolean leapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        System.out.println("Given year " + year + "is a leap year. ->" + leapYear);
    }
}
