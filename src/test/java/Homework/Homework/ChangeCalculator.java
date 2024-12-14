package Homework.Homework;
public class ChangeCalculator {
    public static void main(String[] args) {
        int totalValue = 93;
        System.out.println("Total value:"+ totalValue + " cents");
        int quarter = 25, dimes = 10, nickles= 5, penny = 1;

        int coinsQ = totalValue / quarter;
        totalValue %= quarter;
        System.out.println(coinsQ + " Quarters" );

        int coinsD = totalValue / dimes;
        totalValue %= dimes;
        System.out.println(coinsD + " Dimes" );

        int coinsN = totalValue / nickles;
        totalValue %= nickles;
        System.out.println(coinsN + " Nickels" );

        int coinsP = totalValue / penny;
        System.out.println(coinsP + " Pennies" );
    }
}


