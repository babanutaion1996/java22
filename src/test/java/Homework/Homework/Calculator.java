package Homework.Homework;

public class Calculator {
    public static void main(String[] args) {
        double q = 0.25;
        double d = 0.10;
        double n = 0.05;
        double p = 0.01;
        double results = q*5 + d*4 + n*3 + p*2;

        System.out.println("Quarters:5");
        System.out.println("Dimes:4");
        System.out.println("Nickels:3");
        System.out.println("Pennies:2");
        System.out.printf("The total in dollars is: $%.2f%n", results);


    }
}