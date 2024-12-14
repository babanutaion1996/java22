package Homework.Homework2;

import java.util.Scanner;

public class HW4_TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passwordChar = 8;
        System.out.println("Please enter password lenght: ");
        int passwordLenght = scanner.nextInt();
        System.out.println("Does the password contain special character: ");
        boolean hasSpecialChar = scanner.nextBoolean();
        System.out.println("Does the password contain spaces: ");
        boolean hasSpaces = scanner.nextBoolean();
        boolean validPassword = passwordLenght >= passwordChar && hasSpecialChar&& !hasSpaces;
        System.out.println("Print true if the password is valid, otherwise print false. " + validPassword);

    }
}
