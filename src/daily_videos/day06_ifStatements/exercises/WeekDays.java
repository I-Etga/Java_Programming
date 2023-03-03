package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number 1-7: ");
        int day = scanner.nextInt();
        boolean isMonday = day == 1;
        boolean isTuesday = day == 2;
        boolean isWednesday = day == 3;
        boolean isThursday = day == 4;
        boolean isFriday = day == 5;
        boolean isSaturday = day == 6;
        boolean isSunday = day == 7;

        if (isMonday) {
            System.out.println("Monday");
        } else if (isTuesday) {
            System.out.println("Tuesday");
        } else if (isWednesday) {
            System.out.println("Wednesday");
        } else if (isThursday) {
            System.out.println("Thursday");
        } else if (isFriday) {
            System.out.println("Friday");
        } else if (isSunday) {
            System.out.println("Sunday");
        } else if (isSaturday) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Input. Please give a number 1-7");
        }
        ///// V.1'2 WITHOUT BOOLEAN
        if (day == 1) {
                System.out.println("Monday");
        } else if (day == 2) {
                System.out.println("Tuesday");
        } else if (day == 3) {
                System.out.println("Wednesday");
        } else if (day == 4) {
                System.out.println("Thursday");
        } else if (day == 5) {
                System.out.println("Friday");
        } else if (day == 6) {
                System.out.println("Saturday");
        } else if (day == 7){
                System.out.println("Sunday");
        }else {
            System.out.println("Invalid Input. Please give a number 1-7");
        }



      //// V2.0   --- WITH NESTED IF STATEMENT
        if (day >= 1 && day <= 7)
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        else {
            System.out.println("Invalid Input. Please give a number 1-7");
        }

    }
}
