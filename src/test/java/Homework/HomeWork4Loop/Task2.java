package Homework.HomeWork4Loop;


public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter a number between 100 and 200");
        for (int i = 100; i < 200; i++) {
            if (i % 11 == 0) {
                System.out.println(i + "");
                sum += +i;
            }
        }

        System.out.println("The sum " + sum);
    }
}

