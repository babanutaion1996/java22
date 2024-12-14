package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter price of first item: ");//
        double priceOfFirstItem = scanner.nextDouble();
        System.out.println("Please enter price of second item: ");//
        double priceOfSecondtItem = scanner.nextDouble();
        // 50% off second tem -> secondItem/2 -> secondItem * 0.5
        double calc = priceOfFirstItem + priceOfSecondtItem/2;
        boolean calculation = calc < 50;
        System.out.println("Print false if price is greater than 50 "+ calculation + " The item price is: " +  calc);
    }
}
