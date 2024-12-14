package Primitives.Casting;

public class CastingArithmeticOperators {
    public static void main(String[] args)
    {
      // When two data different primitive types is used in arithmetic operation, result will automatically promoted to a larger data type
        double var = 4 + 4.0;
        //Since java understands every decimal number as a double result of the arithmetical operation will be promoted to double data type.
        System.out.println(var);
        float f1= 5f;
        float var1 = 6.7f;// f at the end of the value is ashortcut to casting double value tot float
        float f2 =(float)6.7;

        double d = 5;
        float f3 = (float)d;

        long l1 = 2;
        float result = f1+l1;
        //byte,short,chart will always be promoted to int data type when used in arithmetic operation.

        byte b= 10;
        byte b1 = 11;
        int result3 = b + b1;//will result in integer value.
        System.out.println(result3);

    }
}
