package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List5_Practice2 {
    public static void main(String[] args) {
        // Given a list of integers, write a program to remove duplicate elements and print he list with unique values only,
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 5, 4, 8, 5, 2, 2, 8);

        List<Integer> uniqValues = new ArrayList<>();
        // We will loop through the number list, and for each element we will check if the uniqueValues conaint the element. If it does we will skip,
        // if uniqueValues list doens't contains the element to the unique values
        for (int eleement : numbers) {
            if (!uniqValues.contains(eleement)){
                uniqValues.add(eleement);
            }

        }
        System.out.println(uniqValues);
    }
}
