package Primitives.BooleanComparasion;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets purcased: ");//3
        int numberOfTickets = scanner.nextInt();
        // Asking user capacity of the stadium
        System.out.println("Please enter capacity of the stadium: ");//3
        int capacityOfStadium = scanner.nextInt();

        boolean calculation = capacityOfStadium > numberOfTickets;
        System.out.println("Any tickets left for the game (true if there is any) "+calculation);
    }
}
