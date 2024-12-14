package Homework.Homework;

public class WheelsOnChair {
    public static void main(String[] args) {
        int NumberOfWheelsCase = 5, NumberOfWheelsSavent = 4;
        int numberOfChairsCase = 6, numberOfChairsSavent = 5;
        int calc = NumberOfWheelsCase * numberOfChairsCase + NumberOfWheelsSavent * numberOfChairsSavent ;
        System.out.println("For " + numberOfChairsCase + " Steelcase and " + numberOfChairsSavent +
                " Savant chairs,a total of " + calc + " wheels are required.");

    }
}
