package Primitives.ArithmeticOperators;

public class Ex4 {
    public static void main(String[] args) {
        // Create an integer variable and regadless of the value your code should print the lsat digit of that nubmer
        int number = 54927;
        System.out.println(number % 10); number /= 10;
        System.out.println(number % 10); number /= 10;
        System.out.println(number % 10); number /= 10;
        System.out.println(number % 10); number /= 10;
        System.out.println(number % 10);

    }
}
