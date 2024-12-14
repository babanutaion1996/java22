package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean8 {
//# Multiple of 3 and 5
//# Write a program that takes a number as input and prints
//# true if the number is a multiple of both three and five,
//# False otherwise.
//# Note: Multiple of 3 and 5 means that it could be
//#  divisible by both 3 and 5.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number: ");
    int enterNumber = scanner.nextInt();
    boolean isDivisible = enterNumber % 3 == 0 && enterNumber % 5 == 0;
    System.out.println("Is the number divisible by both 3 and 5 -> " + isDivisible);

}
}
