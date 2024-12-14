package Homework.Homework2;

import java.util.Scanner;

public class HW4_TASK1 {
    public static void main(String[] args) {
        System.out.println("To see if employee qualifies for the bonus , please input your data");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the days worked in a month ");
        int daysWorked = scanner.nextInt();
        System.out.println("Please enter the number of hours worked in a month ");
        int hoursWorked = scanner.nextInt();
        System.out.println("Please enter the number of late arrivals in the month ");
        int lateArrivals = scanner.nextInt();
        boolean calculation = (daysWorked >= 20 || hoursWorked >= 160) && lateArrivals <= 2;
        System.out.println("Does the employee qualifies for the bonus? " + calculation);
    }
}
