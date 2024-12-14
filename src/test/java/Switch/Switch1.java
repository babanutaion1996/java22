package Switch;

import java.util.Scanner;
// Only work with byte/short/int/char/  and String object.

public class Switch1 {
    public static void main(String[] args) {
        // Ask user to enter a number of the month. And then print the name of the mont
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
                case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("Februaru");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("Sept");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("Nov");
                break;
                default:
                    System.out.println("Invalid month number.");
                    break;



        }
    }
}
