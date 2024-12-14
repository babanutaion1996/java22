package Arrays1;

public class Array5_Practice {
    public static void main(String[] args) {
        String[] words = {"testing","cloud","server","api","database","mobile","cloudfront","json"};
        // Write a program that counts how many times the letter 'e' appears across all string in the array.
        int countOfE = 0;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length(); j++) {
                if (currentWord.charAt(j) == 'e') {
                    countOfE++;
                }
            }

        }
        System.out.println("Total number of 'e' in this array is " + countOfE + ".");




    }
}
