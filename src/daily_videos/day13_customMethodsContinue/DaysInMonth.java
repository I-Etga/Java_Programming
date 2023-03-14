package daily_videos.day13_customMethodsContinue;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

                    // using (single if + return) instead of NESTED if statements

        System.out.println("Please enter the number of a month");
        int month = new Scanner(System.in).nextInt();
        String message = "It's ";
        int daysOfMonths = 0;

        if (month < 1 || month > 12) {
            System.err.println("Invalid month");
            return;
        }

        switch (month){
            case 2:
                daysOfMonths =28;
                break;
            case 4: case 6: case 9: case 11:
                daysOfMonths = 30;
                break;
            default:
                daysOfMonths = 31;
        }

        switch (month) {
            case 1:
                message += "January and " + daysOfMonths + " days";

                break;
            case 2:
                message += "February and " + daysOfMonths + " days";
                break;
            case 3:
                message += "March and " + daysOfMonths+ " days";
                break;
            case 4:
                message += "April and " + daysOfMonths+ " days";
                break;
            case 5:
                message += "May and " + daysOfMonths+ " days";
                break;
            case 6:
                message += "June and " + daysOfMonths+ " days";
                break;
            case 7:
                message += "July and " + daysOfMonths+ " days";
                break;
            case 8:
                message += "August and " + daysOfMonths+ " days";
                break;
            case 9:
                message += "September and " + daysOfMonths+ " days";
                break;
            case 10:
                message += "October and " + daysOfMonths+ " days";
                break;
            case 11:
                message += "November and " + daysOfMonths+ " days";
                break;
            default:
                message += "December and " + daysOfMonths + " days";

        }
        System.out.println(message);
    }
}
