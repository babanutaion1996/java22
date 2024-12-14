package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List7_Practice4 {
    public static void main(String[] args) {
        //Given list of string, write a program to count how many time each element appears in the array?
        // List = Input [2,4,4,8,2,4,8]
        // a appears 3 time
        // b appears 3 times
        // c appears 2 times
        // d appears 2 times

        List<String> givenList = new ArrayList<>();
        Collections.addAll(givenList,"a","b", "b", "c", "a","b", "c", "D","d","A");
        List<String> checkedValues = new ArrayList<>();

        for (String element : givenList) {
            if (!checkedValues.contains(element.toLowerCase())) {
                int count = 0;
                for (String restElements : givenList) {
                    if (element.equalsIgnoreCase(restElements)) {
                        count++;
                    }

                }
                checkedValues.add(element.toLowerCase());
                System.out.println("Count of the element " + element + " " + count);
            }
        }


    }
}
