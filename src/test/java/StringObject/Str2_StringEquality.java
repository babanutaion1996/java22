package StringObject;

public class Str2_StringEquality {
    public static void main(String[] args) {
        // == vs equals()method
        // == operator used in primitive data type to compare if both sides are equal to each other.
        // However, == method works diffretenlty with all objects.
        // == operator check if the two object is equal to each other, and check if they are same object in memory.

        // eqauls() method checks if the two string object has the same valuer or nor.
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String ("Hello");

        // Are s1 and s2 same object in the memory -> yes.
        // Do s1 and s2 have the same value? -> yes.
        // Then == operator between s1 and s2 returns true
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));// true-> s1 and s2 string have the same value

        // Are s1 adn s3 same object in the memory? -> No
        // Do s1 and s3 same have same value? -> Yes
        System.out.println(s1 == s3);//false -> Event though, they have the same value, they are not same object in memory.
        System.out.println(s1.equals(s3));// true -> because .equals() method check only the value of this string

        // It is really rare that we have to compare if the two string are the same object in the memory.
        // Usually you need to compare if the two strings have the same value.
        // Therefore , usage of .equals() is more common then ==.

        // .equals() method is also case sensitive
        System.out.println("Str equal to str" + "Str" .equals("str"));
        // Using .equalsIgnoreCase method we could compare the value fo the two string regardless of the case.

        System.out.println("Str equal to str ignore case to str" + "Str" .equalsIgnoreCase("str"));
    }
}
