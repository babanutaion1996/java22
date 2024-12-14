package Homework.Homework2;

import java.util.Scanner;
//


public class HW4_TASK5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minClassAttendancy = 80;
        int examScores = 65;
        System.out.println("Please enter your first exam score :");
        int firstExamScore = scanner.nextInt();
        System.out.println("Please enter your second exam score :");
        int secondtExamScore = scanner.nextInt();
        System.out.println("Please enter your third exam score :");
        int thirdExamScore = scanner.nextInt();
        System.out.println("Please enter your class atendancy 0-100 :");
        int attendancyExamScore = scanner.nextInt();
        double examP1 = (firstExamScore*0.20), examP2 = (secondtExamScore*0.30),examP3 = (thirdExamScore*0.50);
        double examCal = (examP1 + examP2 + examP3);
        boolean passedExam = (attendancyExamScore >= minClassAttendancy) && examCal >= examScores;
        if(passedExam){
            System.out.println("Congratulations you passed the exam" + (int)examCal);
        }else {
            System.out.println("Sorry you didn't passed");
        }

    }
}
