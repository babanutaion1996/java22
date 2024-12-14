package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {
        // Creating a set object
        Set<String> colors = new HashSet<>();
        // Adding object to set
        // We use add() method. The return type of add method is boolean.
        // If the object is succesefully added, then it return true,If the object is not added because it is duplicate then il will return false.
        System.out.println("Size of the list at the beginning is " + colors.size());
        System.out.println("Is the list empty?" + colors.isEmpty());


        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("black");
        colors.add("white");
        // We have added five different(unique) elements to the set. So the size of the set bill be 5.
        System.out.println("Size of the set afeter addding element is  " + colors.size());
        // SO THE METHOD BELLOW WILL RETURN FALSE
        System.out.println("Is the set empty" + colors.isEmpty());
        System.out.println(colors.add("white"));// What will it print // false because we cannot add duplicate value.
        System.out.println("After we try to add white Again size of the set is " + colors.size());
        System.out.println(colors.add("green"));//true
       // Because there is no element with value `green`

        System.out.println("After i added green the size of the set is " + colors.size());

        // Can we reach out a single element from a set?
        // To give a answer of question above let's see when we print tje set
        System.out.println(colors);
        // Since there is no set order of the elements in `SET` object, we cannot access elements using index numbers.
        // There is no index number assign to any element is set.

        // We could find/access the element in a set object if we know which value we are looking for by using for loop.
        // Find if there is green in the colors set and if there is remove the element.
        for(String color:colors){
            if(color.equals("green")){
                System.out.println("There is a green in the set.");
                System.out.println("And now I am going to remove the element green");
                colors.remove("green");
                System.out.println(colors);
                break;
            }
        }

    }
}
