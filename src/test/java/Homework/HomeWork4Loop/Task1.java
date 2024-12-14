package Homework.HomeWork4Loop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines that you want to see.");
        int lineNumber = scanner.nextInt();

        for(int currentLine = 1; currentLine <= lineNumber ; currentLine++){

            for(int numbersInTheLine = 1; numbersInTheLine <= currentLine ; numbersInTheLine++){
                System.out.print("1");
            }
            System.out.println();
        }

    }


}
