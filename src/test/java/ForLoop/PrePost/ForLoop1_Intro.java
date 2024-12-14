package ForLoop.PrePost;

public class ForLoop1_Intro {
    public static void main(String[] args) {

        //Let's print numbers from 10 to 1 inclusiv.
        //1.First with while loop,then with for loop.
        int num = 10;
        while(num >= 1){
            System.out.println(num--);

        }

        for (int num1 = 10;num1 >=1;num1--){
        System.out.println(num1);
        }


    }
}
