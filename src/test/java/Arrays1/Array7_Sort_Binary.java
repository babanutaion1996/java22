package Arrays1;

import java.util.Arrays;

public class Array7_Sort_Binary {
    public static void main(String[] args) {

// Sort method from Arrays class arranges elements in a specific order, typically ascending.
// Sorting makes data easier to manage,search and analyze.
// Syntax
// Arrays.sort() is a built in method to sort ana array in ascending order.
// Ascending order means -> lower value to higher valuer or alphabetically a -> z.
// Upper case letters will always be put before lower case letters.

int[] numbers = {10, 3, 7 ,1, 9 ,5};

// Sort the array in ascending aorder
        Arrays.sort(numbers);

        //Print the sorted array
        System.out.println("Sorter array is: " + Arrays.toString(numbers));

        String[] words = {"Cloud", "API", "Testing", "arm64", "cpu", "test"};
        //Sort the words array in ascending order
        Arrays.sort(words);
        System.out.println("Sorted string is" + Arrays.toString(words));

        // Binary Search
        // It is a efficient algorithm for finding a target value with a sorted array. It works by repeatedly dividing the array in half, comparing
        // middle element with target.

        // How it works?
        // 1. Star with middle element
        // 2. If the middle element is equal to target, search is complete.
        // 3. If the target is smaller than the middle element, discard, the right half and focus left.
        // 4. If the target is bigger than the middle element, discard the left half and focus right.
        // 5. Repeat util element is found or the range is empty.

        int[] nums = {20,2,15,12,5,8};

        int target = 14;
        // In order for binary search to perform array must be sorted.
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int indexNumber = Arrays.binarySearch(nums,target);
// [2, 5, 8, 12, 15, 20]
// 14
if(indexNumber >= 0) {
    System.out.println("Binary search has found the element in the array.");
    System.out.println("And , the index number fo the element in sorter arrays is " + indexNumber);
}else{
    System.out.println("When binary search is performed and the element is nod found binary");
    System.out.println("search returns negative value");
    System.out.println("Return index number from binary search is " + indexNumber);
}


    }
}
