package Homework.HomeWork5List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<String> favoriteGenres = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<Integer> durations = new ArrayList<>();
       // ask how many members to enter
        System.out.println("Please enter the number of members");
        int memberCount  = scanner.nextInt();

        for (int i = 0; i < memberCount; i++) {
            System.out.println("Enter details for member " + (i + 1) + ":");

            System.out.print("Name: ");
            scanner.nextLine(); // Consume the newline left from nextInt
            String name = scanner.nextLine();
            names.add(name);

            System.out.print("Favorite Genre: ");
            String genre = scanner.nextLine();
            favoriteGenres.add(genre);

            System.out.print("Age: ");
            int age = scanner.nextInt();
            ages.add(age);

            System.out.print("Membership Duration (in years): ");
            int duration = scanner.nextInt();
            durations.add(duration);
        }
// calculate the average membership duration
        int totalDuration = 0;
        for(int duration : durations){
            totalDuration += duration;
        }
    double averageDuration = (double) totalDuration/memberCount;

        System.out.println("Average membership duration" + averageDuration + " years");
        System.out.println("Memebers with durationb above the average");
        for (int i = 0; i < memberCount; i++) {
            if(durations.get(i) > averageDuration){
                System.out.println("Name:" + names.get(i) + "Favorite gengres" + favoriteGenres.get(i));
            }

        }

    }
}
