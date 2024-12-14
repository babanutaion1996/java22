package Arrays1;

import java.util.Arrays;

public class Array2_Loops {
    public static void main(String[] args) {
        int [] zipCodes = new int[4];
        zipCodes[0] = 60654;//First element in arrays is intialized
        zipCodes[1] = 60650;//Second element in arrays is intialized
        zipCodes[2] = 60018;//Third element in arrays is intialized
        zipCodes[3] = 60173;//Fourth element in arrays is intialized
        System.out.println(Arrays.toString(zipCodes));
        //Let's print only even zipcodes from an array

        for(int index = 0; index <zipCodes.length; index++){
          int currentZipCode = zipCodes[index];
          if(currentZipCode % 2 == 0){
              System.out.println(currentZipCode);
          }
        }





    }
}
