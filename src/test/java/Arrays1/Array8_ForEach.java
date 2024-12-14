package Arrays1;

public class Array8_ForEach {
    public static void main(String[] args) {
        // for each method is a just a for loop with different syntax.
        // When index number of element is not needed, and only important thing is to reach individual elements from a collection we can use a foreach loop.

        int[] numbers = {1,2,3};
        // Both when a regular loop might be better and when for each loop would be better.
        // find the first odd number in array and return the index number of it.
        // print each number in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            // Did we use index numbers for any other purpose than accessing the element?

            if(numbers[i] %2 != 0){
                System.out.println("First odd number is found: " + i);
            break;
            }

        }

   // numbers = {0,2,3};
   // print each number in the array.
    for ( int num: numbers ){
        System.out.println(num);
        }

String [] words = {"hello","world","Java", "programming"};
    for(String aWord: words){
        System.out.println(aWord);
    }

    

    }
}
