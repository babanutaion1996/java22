package ForLoop.PrePost;

public class ForLoop3_Practice {
    public static void main(String[] args) {
        String str = "Java is getting very easy to work with";
        //Print the count of letter 't' from the string above
        //1. I would check each letter in a string.
        //2 Everytime i encounter letter 't' . I would increase the count fo letter t.
        //3. To store the count of the letter i would create a variable.
        //4. To check each letter in a string i would use loop.
        System.out.println(str.indexOf("t"));
        int letterT = 0;
        // The range of value that i need to look starts from 0 and goes uot to leght of string.
        // as an index lenght of string is not included.
        for (int i = 0;i<str.length();i++){
            // How could i check the letter at index number i?
            char currentCharacter = str.charAt(i);
            // If the current character is 't', then i would increase the count of letter t.
            if(currentCharacter == 't'){
                letterT++;
                System.out.println("Counter of letter t in the string is " + letterT + ".");
            }
        }






    }
}
