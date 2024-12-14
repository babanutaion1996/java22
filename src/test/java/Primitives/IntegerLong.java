package Primitives;

public class IntegerLong {
    public static void main(String[] args) {
      // Integer and Long
      // These data type are used for stroring integer values.
      // ....-1,-2,0,1,2....
        // By default java uses integer type for non-decimal numbers.
        //Therefore, when we assign an integer value to long type we have to use "l" at the end of the value.
        // long is a larger data type that integer. Integer is 32, "long" is 64 bit.
        // Creating anb integer variable
        int numberOfComputers = 41;
        System.out.println(numberOfComputers);
        // int  averageGrade = 5.6;
        // The variable creation above won't work because decimal number CANNOT be assigned to int or long data type.
        long numOfVariable = 90000;
        System.out.println(numOfVariable);
// The main difference between long and integer is amount of memory they use, long use 64 bit while integer 32 bit.
        // long is the larger data type of the two, long can store larger values,
        // Learn the maximum valu7e for integer and long
        System.out.println("Max value for Integer:" + Integer.MAX_VALUE);
        System.out.println("Max value for Long:" + Long.MAX_VALUE);






    }
}
