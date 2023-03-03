package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class SwitchStatementIntro3 {
    public static void main(String[] args) {

        /*
        int score = 80;
        String result = "";

        if (score >= 90) {
            result = "Excellent";
        } else if (score >= 80) {
            result = "Great Job";
        } else if (score >= 70) {
            result = "Good";
        } else if (score >= 60) {
            result = "Passed";
        } else if (score < 60) {
            result = "Failed";
        } else {
            result = "Invalid Grade. Please enter a grade A-E/a-e";
        }
        System.out.println(result);

        System.out.println("************************");



         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("month: ");
        int month = scanner.nextInt();
        String result = "";
        if (month >= 1 && month <= 12) {
            if (month == 1) result = "January";
            else if (month == 2) result = "February";
            else if (month == 3) result = "March";
            else if (month == 4) result = "April";
            else if (month == 5) result = "May";
            else if (month == 6) result = "June";
            else if (month == 7) result = "July";
            else if (month == 8) result = "August";
            else if (month == 9) result = "September";
            else if (month == 10) result = "October";
            else if (month == 11) result = "November";
            else result = "December";
            System.out.println("Month = " + result);
        } else {
            System.out.println("Invalid Input. Please give a number 1-12");
        }

        System.out.println("***********************");

        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid";
                break;
        }
        scanner.close();
        System.out.println(result);
    }
}