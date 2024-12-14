package Homework.Homework2;

import java.util.Scanner;
/// area of rectangle        #####           Area=length×width
public class HW3_TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lenght of the Rectangle: ");
        double lenghtOfRectangle = scanner.nextDouble();
        System.out.println("Please enter the width of the Rectangle: ");
        double widthOfRectangle = scanner.nextDouble();
        double calculationArea = lenghtOfRectangle * widthOfRectangle;
        System.out.println("Area of rectangle is: " + (int)calculationArea);
    }
}
