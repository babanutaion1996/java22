package Primitives.ArithmeticOperators;

public class Ex3 {
public static void main(String[] args) {
        // A company has 57 tester and there are 8 team in the company.
        //After assigning equal amount fo tester to each team. How many tester won't be assigned with a team.

        int testers = 57, teams = 8;
        // We will have to find the lef over after dividing 57 with 8.
        // Because we have 57 tester which should equally ditributed to 8 teams, So we have to divide 57 with 8 and the find the leftover.
        int calc = testers % teams;
        System.out.println("Testers left w/o team: " + calc);
        // Find out how many testers each team  will get
        int testersPerTeam = testers / teams;
    System.out.println("In each team there will be " + testersPerTeam + " testers.");


    }
}
