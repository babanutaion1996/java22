package Primitives.ArithmeticOperators;

public class Ex2 {
    public static void main(String[] args) {

       int elephants = 8, tigers = 12, parrots = 24;
       int amountOfFoodE = 50, amountOfFoodT = 20, amountOfFoodP = 2;
       int calculation = elephants * amountOfFoodE + tigers * amountOfFoodT + parrots * amountOfFoodP;
        System.out.println("Amount of food in one day: " + calculation + " Amount of food in a month: " + (calculation * 30) +
                " Amount food in a year: "+ (calculation * 365)) ;






    }
}

