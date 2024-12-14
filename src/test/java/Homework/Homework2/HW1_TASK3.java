package Homework.Homework2;

import java.util.Scanner;

public class HW1_TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value in meters for conversion: ");
        int meterValue = scanner.nextInt();
        double conversionConstantF = 3.281;
        int conversionConstantC = 100;
        double calculationF = meterValue * conversionConstantF;
        int calculationC = meterValue * conversionConstantC;
        System.out.println("The " + meterValue + "m. convertered to feets and CM is: "+ calculationF + " feets. & " + calculationC + " cm");
    }
}
