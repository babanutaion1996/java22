package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List6_Practice3 {

    public static void main(String[] args) {

        // Given list of integers, write a program to find difference between the maximum and the minimum values in the list.
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,8,2,14,5,9);
        int largest = numbers.get(0);
        int smallest = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if(largest < numbers.get(i)){
                largest = numbers.get(i);
            }


            if(numbers.get(i) < smallest){
                smallest = numbers.get(i);
            }


        }

        System.out.println("The result is " + (largest - smallest) + " Which is (biggest) -> " + largest + "-" + smallest + " <- (smallest)");

// FOR EACH LOOP
//        List<Integer> numbers = new ArrayList<>();
//        Collections.addAll(numbers,8, 2, 14, 5, 9);
//        int theMax = numbers.get(0);
//        int theMin = numbers.get(0);
//        for(int num : numbers){
//            if(num > theMax){
//                theMax = num;
//            }
//            if(num < theMin){
//                theMin = num;
//            }
//        }
//        System.out.println("The biggest value in the list is "+ theMax);
//        System.out.println("The lowest value in the list is "+ theMin);
//        System.out.println("And, the difference between the maximum and minimum is "+ (theMax - theMin))



    }
}
