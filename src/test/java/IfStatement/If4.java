package IfStatement;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the amount to be shipped: ");
        int shipmentGoal = scanner.nextInt();
        System.out.println("Enter the number big packages in invetory.");
        int numBigPack = scanner.nextInt();
        System.out.println("Enter the number small packages in invetory.");
        int numSmallPack = scanner.nextInt();

        //How can i find out the number of packages
        int idealBigPackNeed = shipmentGoal / 5;// beacuse the one big pack si 5 kg.
        int smallPackNeed;
        if(idealBigPackNeed <=numBigPack) {
            // In this if blokc , I know that i have enoguht big packages
            // How ca i calculate number of small pack needed?
            // We could just find the reaminder with 5 cot calculate nubmer of small packaged needed.
             smallPackNeed = shipmentGoal % 5;
            // At the end we will come to see how to calculate whether we have enought small pack.

        }else {
            // In this esle block there is not ideal amount of big package.
            // calculate how much you can ship will all big packages
            int totalBigPack = numBigPack * 5;
            smallPackNeed = shipmentGoal - totalBigPack;

        }
        // I know how much smallPack I need.
        if(smallPackNeed <= numSmallPack) {
            System.out.println("Yes you could do the shippement and you will use" + smallPackNeed + "Small packs.");
        }else{
            System.out.println("You cannot do the shippement");
        }
    }
}
