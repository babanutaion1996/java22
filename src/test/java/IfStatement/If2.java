package IfStatement;
//
// Create program that calculates the grade letter of a student.
// Ask user their grade as an integer number.Print `Not a valid grade` if
// the grade is lower than 0 or bigger than 100.
// Print A+ if the grade is higher than 94
// Print A if the grade is in between 85 and 94 inclusive.
// print B if the grade is in between 75 and 84 inclusive
// print C if the grade is in between 65 and 74 inclusive.
// print grade doesn't meet expectations when the grade is
// lower than 65.

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the user grade");
        int num1 = scanner.nextInt();
        if (num1 < 0 || num1 > 100) {
            System.out.println("Not a valid grade");
        }else if(num1 > 94){
            System.out.println("Your grade is +A ");
        }else if(num1 >=85){
            System.out.println("Your grade is A ");
        }else if(num1 >=75){
            System.out.println("Your grade is B ");
        }else if(num1 >=65){
            System.out.println("Your grade is C ");
        }else{
            // Anything above 0 including 0 and below 65 will not be cosidered in this else
            System.out.println("Grade doesn't meet expectations  ");
        }
    }
}
