package Homework.HomeWork5List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of teams
        System.out.print("Enter the number of teams: ");
        int numberOfTeams = scanner.nextInt();

        // Step 2: Use List<List<Integer>> to store scores
        List<List<Integer>> scores = new ArrayList<>();

        // Step 3: Input scores dynamically for each team
        for (int team = 0; team < numberOfTeams; team++) {
            System.out.println("\nEnter scores for Team " + (team + 1) + " (enter -1 to stop):");
            List<Integer> teamScores = new ArrayList<>();

            while (true) {
                System.out.print("Enter score: ");
                int score = scanner.nextInt();
                if (score == -1) { // Sentinel value to stop input
                    break;
                }
                teamScores.add(score);
            }

            scores.add(teamScores);
        }

        // Step 4: Calculate average scores for each team
        List<Double> averages = new ArrayList<>();
        double highestAverage = 0;
        int bestTeam = -1;

        System.out.println("Average Scores:");
        for (int team = 0; team < scores.size(); team++) {
            List<Integer> teamScores = scores.get(team);

            // Calculate total and average
            int total = 0;
            for (int score : teamScores) {
                total += score;
            }
            double average = (double) total / teamScores.size();
            averages.add(average);

            System.out.println("Team " + (team + 1) + ": " + average);

            // Track the team with the highest average
            if (average > highestAverage) {
                highestAverage = average;
                bestTeam = team + 1;
            }
        }

        // Step 5: Display the team with the highest average score
        System.out.println("Team with the highest average score: Team " + bestTeam);


    }
}