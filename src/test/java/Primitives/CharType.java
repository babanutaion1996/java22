package Primitives;

public class CharType {
    public static void main(String[] args) {
       char letter = 77 ; // char data type will find character is ASCII table that has value 77.
        System.out.println(letter);// This will print the character 'M' as the value of character M is 77.
        char letter2 = 'T';
        // chart data type will be assigned with character 'T'
        System.out.println(letter2);
        //NOTE! When forced char data type can act with numerical value of characters.
        char ch = 'a';
        //the numerical value of letter 'a' is 97.
        System.out.println(ch+ 10);//Since we forced char data type to be added to a number it will use
        // the numerical value of the character. Therefore, the result is going to be 107.
        System.out.println(ch + " text");// It WILL BE USIGN THE CHARACTER SO -> 'a text'
    }
}