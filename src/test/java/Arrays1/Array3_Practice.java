package Arrays1;

public class Array3_Practice {
    public static void main(String[] args) {
        int[] numbers = {4,2,55,98,304,41,-30};
        // Display largest, and smallest value from the given array.
        // This value is going to be from an array.
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }

            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Largest values in the arrays is " + largest);
        System.out.println("Smallest value in the arrays is " + smallest);



    }
}
