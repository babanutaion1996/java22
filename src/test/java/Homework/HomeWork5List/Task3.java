package Homework.HomeWork5List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> dates = new ArrayList<>();

        System.out.print("How many records to store");
        int datesEntered = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < datesEntered; i++) {
            System.out.println("Enter details for checkout record" + (i + 1) + ":");
            System.out.print("Please enter the title of thew book: ");
            String bookTitle = scanner.nextLine();
            titles.add(bookTitle);

            System.out.println("Name of the member");
            String name = scanner.nextLine();
            names.add(name);

            System.out.println("Checkout date (YYYY-MM-DD)");
            String date = scanner.nextLine();
            dates.add(date);
        }

        System.out.println("Enter date to search (YYYY-MM-DD)");
        String searchDate = scanner.nextLine();

            System.out.println("Books checked out on " + searchDate );
            boolean found = false;

            for (int i = 0; i < dates.size(); i++) {
                if(dates.get(i).equals(searchDate)){
                    System.out.println("Title"+ titles.get(i) + "Member" + names.get(i));
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No books were checked out on this date.");
            }
        }

    }

