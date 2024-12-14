package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean9 {
    public static void main(String[] args) {

        //  John wants to lose 10 pounds in one month.
// There are multiple conditions to lose 10 pounds in a mont.
// John needs to walk 10000 steps daily  OR needs to run at
// least 4 miles a day.  and Addition to these, John needs to
// eat less than 1500 calories daily. We should create a
// program to calculate if John can lose weight or not.
// daily steps, running distance and daily caloric intake
// will be given by user. Our goal is to print true when
//  John can lose weight and print false otherwise.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter daily steps ");
        int dailySteps = scanner.nextInt();
        System.out.println("Please enter running distance ");
        int runingDistance = scanner.nextInt();
        System.out.println("Please enter daily caloric instake ");
        int caloricIntake = scanner.nextInt();

        //To lose 10 pounds there is two conditon: 1st is movement, 2. is caloric instake.
        boolean calculation = (dailySteps >= 10000 || runingDistance >= 4) && caloricIntake < 1500;
        //Since we would like to calculate movement as a single conditon to avoid && operation being completed first, we are using parentheses to add precedence
        // to or operator.
        System.out.println("Can lose the 10 pounds? " + calculation);

    }
}
