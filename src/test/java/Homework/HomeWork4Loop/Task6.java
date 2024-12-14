package Homework.HomeWork4Loop;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        do {
            System.out.println("Please enter first nubmer");
            int number1 = scanner.nextInt();
            System.out.println("Please enter second nubmer");
            int number2 = scanner.nextInt();
            System.out.println("Please enter third nubmer");
            int number3 = scanner.nextInt();

            int sum = number1 + number2 + number3;

            System.out.println("The sum of a number is " + sum);
            System.out.println(" DO YOU WANT TO PERFORM ANOTHER OPERATION (Yes/No) ");
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase("Yes")); {
                System.out.println("SUGE CUCU");
            }

        }

    }
