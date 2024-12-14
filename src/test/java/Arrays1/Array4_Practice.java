package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Array4_Practice {
    public static void main(String[] args) {
        // Ask user how many number they want to enter.
        // Ask them enter each value individually.
        // Store all the values that user entered, in an array.
        // Find sum of all the values from the array, and find the average of the values in an array.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers that you will give: ");
        int sizeOfTheNumbers = scanner.nextInt();
        int[] givenNumbers = new int[sizeOfTheNumbers];
        int orederNumber = 1;
        while(orederNumber <= sizeOfTheNumbers){
            System.out.println("Please enter the number " + orederNumber+ ".");
            int input = scanner.nextInt();
            // How could i add this input that i get from the user to the array?
            givenNumbers[orederNumber-1] = input;
            orederNumber++;
        }
        System.out.println(Arrays.toString(givenNumbers));
        int sum = 0;
        for(int i = 0;i<givenNumbers.length;i++){

            sum+= givenNumbers[i];

        }
        System.out.println("Sum of all the number in the arrays is " + sum);

        // To find an average we will divide sum of numbers to length of numbers.
        double average = (double) sum / givenNumbers.length;
        System.out.println(average);


    }
}
