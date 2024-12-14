package Homework.Homework2;

import java.util.Scanner;

public class HW3_TASK5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three integral numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean result = (number1  == number2) || (number2 ==  number3) ;
        System.out.println(result);
    }
}
