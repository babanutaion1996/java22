package Homework.Homework2;

import java.util.Scanner;

public class HW1_TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in F : ");
        int tempValueF = scanner.nextInt();
        int calculationFtoC = (tempValueF - 32) * 5/9; //
        System.out.println("The temperature in C is: " + calculationFtoC);
    }
}
