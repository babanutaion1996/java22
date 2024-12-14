package Homework.Homework3;

import java.util.Scanner;

public class HW3_TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectedSongPrice = 0;
        int songPriceClassical1 = 2, songPriceClassical2 = 2, songPriceClassical3 = 2, songPriceClassical4 = 2, songPriceClassical5 = 2;
        int songPricePop1 = 4, songPricePop2 = 4, songPricePop3 = 4, songPricePop4 = 4, songPricePop5 = 4;
        int songPriceCountry1 = 3, songPriceCountry2 = 3, songPriceCountry3 = 3, songPriceCountry4 = 3, songPriceCountry5 = 3;
        String classical = "Classical";
        String songNameClassical1 = "Song1C", songNameClassical2 = "Son2C";
        String songNameClassical3 = "Song3C", songNameClassical4 = "Song4C", songNameClassical5 = "Song5C";
        String pop = "Pop";
        String songNamePop1 = "Song1P", songNamePop2 = "Son2P";
        String songNamePop3 = "Song3P", songNamePop4 = "Song4P", songNamePop5 = "Song5P";
        String country = "Country";
        String songNameCountry1 = "Song1Country", songNameCountry2 = "Song2Country";
        String songNameCountry3 = "Song3Country", songNameCountry4 = "Song4Country", songNameCountry5 = "Song5Country";

        System.out.println("Please make your selection:");
        System.out.println("Available music genre:".concat(" " + classical).concat(" " + pop).concat(" " + country));
        String userInput = sc.nextLine();


        if (userInput.equals(classical)|| selectedSongPrice > 0) {
            selectedSongPrice = 2;
            System.out.println("In genre " + userInput + ", these songs are available: " + " " + songNameClassical1
                    + " " + songNameClassical2 + " " + songNameClassical3 + " " + songNameClassical4 + " " + songNameClassical5);
            String songChoice = sc.nextLine();
            boolean isValidSong = songChoice.equals(songNameClassical1) || songChoice.equals(songNameClassical2)
                    || songChoice.equals(songNameClassical3) || songChoice.equals(songNameClassical4)
                    || songChoice.equals(songNameClassical5);
            if (isValidSong) {
                System.out.println("You selected: " + songChoice);
            } else {
                System.out.println("This song name is not valid.");
            }




        } else if (userInput.equals(pop)) {
            selectedSongPrice = 4;
            System.out.println("In genre " + userInput + ", these songs are available: " + " " + songNamePop1
                    + " " + songNamePop2 + " " + songNamePop3 + " " + songNamePop4 + " " + songNamePop5);
            String songChoice = sc.nextLine();
            boolean isValidSong = songChoice.equals(songPricePop1) || songChoice.equals(songNamePop2)
                    || songChoice.equals(songNamePop3) || songChoice.equals(songNamePop4)
                    || songChoice.equals(songNamePop5);
            if (isValidSong) {
                System.out.println("You selected: " + songChoice);
            } else {
                System.out.println("This song name is not valid.");
            }


        } else if (userInput.equals(country)) {
            selectedSongPrice = 3;
            System.out.println("In genre " + userInput + ", these songs are available: " + " " + songNameCountry1
                    + " " + songNameCountry2 + " " + songNameCountry3 + " " + songNameCountry4 + " " + songNameCountry5);
            String songChoice = sc.nextLine();
            System.out.println("You selected: " + songChoice);
            boolean isValidSong = songChoice.equals(songNameCountry1) || songChoice.equals(songNameCountry2)
                    || songChoice.equals(songNameCountry3) || songChoice.equals(songNameCountry4)
                    || songChoice.equals(songNameCountry5);
            if (isValidSong) {
                System.out.println("You selected: " + songChoice);
            } else {
                System.out.println("This song name is not valid.");
            }

        } else {
            // Message for invalid genre
            System.out.println("The genre entered is not valid. Please select a valid genre.");
        }


        if (selectedSongPrice > 0) {
            System.out.println("Price for the song is $" + selectedSongPrice);
            int totalPayment = 0;

            while (totalPayment < selectedSongPrice) {
                System.out.println("Please enter the dollar amount for the song:");
                int userPayment = sc.nextInt();
                totalPayment += userPayment;

                if (totalPayment < selectedSongPrice) {
                    System.out.println("You have entered a total of $" + totalPayment + ". Please add $"
                            + (selectedSongPrice - totalPayment) + " more.");
                } else if (totalPayment == selectedSongPrice) {
                    System.out.println("Enjoy the song!");
                    break;
                } else {
                    System.out.println("Please wait for change: $" + (totalPayment - selectedSongPrice));
                    break;
                }
            }
        }
    }
}