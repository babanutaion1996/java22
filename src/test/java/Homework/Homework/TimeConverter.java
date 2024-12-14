package Homework.Homework;

public class TimeConverter {
    public static void main(String[] args) {
      int minutesInYear = 525600, minutesInDay = 1440, minutesValue = 3456789;
      int calculation = minutesValue / minutesInYear;
      int rem = minutesValue % minutesInYear / minutesInDay ;
        System.out.println(minutesValue + " minutes is approximately " + calculation + " years and " + rem + " days" );
    }
}
