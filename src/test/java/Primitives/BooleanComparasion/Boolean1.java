package Primitives.BooleanComparasion;

public class Boolean1 {
    public static void main(String[] args) {
        // Let's create a code that will print true if a user can vote
        // User's age will be given as a integer variable and age to vote is 18 and up
        int userAge = 50;
        int ageToVote = 18;
        // How can we print true or false depending on if a user can vote?
        boolean canVote = userAge >= ageToVote;
        System.out.println("Can user vote? -> " + canVote);
    }
}
