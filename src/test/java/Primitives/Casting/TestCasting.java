package Primitives.Casting;

public class TestCasting
{
    public static void main(String[] args) {
        //Implicit casting happens small data type to higher data type
        float f =41;
        //What is the data type of variabl f?
        //float
        int num = (int)f;//The variable f is expllivitly caste to integer type.
        System.out.println("The variable f is ->" +f); //41.0
        System.out.println("The variable num is ->"+ num);//41

        // Casting from decimal number to a whole number will always get rid of all the decimal part. No rounding will happen.

        double d1 = 47.99;
        byte b = (byte)d1;
        System.out.println("double variable with value 47.99 casted to byte -> "+ b);// It will get rid of .99 and it will be 47
    }
}
