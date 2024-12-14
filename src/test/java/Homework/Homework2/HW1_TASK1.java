package Homework.Homework2;

import java.util.Scanner;

public class HW1_TASK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter computer price (suggested retail 1000$): ");
        int computerPrice = scanner.nextInt();
        System.out.println("Please enter tv price (suggested retail 800$) : ");
        int tvPrice = scanner.nextInt();
        System.out.println("Please enter tablet price (suggested retail 450$) : ");
        int tabletPrice = scanner.nextInt();
        int computerQ = 4, tvQ = 3, tabletQ = 5;
        int calculation = computerPrice * computerQ + tvPrice * tvQ + tabletPrice * tabletQ;
        System.out.println("I'm buying 4 computer, 3 tv's and 5 tables, the result is: " + calculation + "$ spent total");
    }
}
