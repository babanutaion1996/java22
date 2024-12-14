package StringObject;

import java.util.Scanner;

public class Str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int startingIndexBad = str.indexOf("bad");
        boolean result =startingIndexBad == 1 || startingIndexBad == 0;
        System.out.println(result);

//        if(startingIndexBad == 1 || startingIndexBad == 0){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }






    }
}
