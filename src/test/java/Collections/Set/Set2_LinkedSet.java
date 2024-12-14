package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set2_LinkedSet {
    public static void main(String[] args) {
        // Creation of the linked set.
        Set<String> cities = new LinkedHashSet<>();
        // add elements to set
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Nashville");
        cities.add("Huston");
        cities.add("Minneapolis");

        cities.add("New York");// Ignored, as it is duplicate
        cities.add(null); // Allows one null value.

        System.out.println("Size of the set: " + cities.size());
        // Let's print out the set.
        System.out.println(cities);// Insertion order is protected.

        // Check if the set contains city Portland
        System.out.println("Contains: Portland: " + cities.contains("Portland"));

        // Can we access the individual elements from the LinkedSet?
        // No, LinkedSet doesn't allow you to access elements individually.
    }
}
