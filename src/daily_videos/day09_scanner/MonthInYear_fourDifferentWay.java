package daily_videos.day09_scanner;

import java.util.Scanner;

public class MonthInYear_fourDifferentWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of month: ");
        int month = scanner.nextInt();
        String result = "";

        boolean isValid = (month >= 1 && month <= 12);
        // I can declare a new boolean named isNotValid and assign !isValid or use !isValid direct as condition


        System.out.println("****** #1 (nested)if statements");
        if (isValid) {
            if (month == 1) {
                result = "January";
            } else if (month == 2) {
                result = "February";
            } else if (month == 3) {
                result = "March";
            } else if (month == 4) {
                result = "April";
            } else if (month == 5) {
                result = "May";
            } else if (month == 6) {
                result = "June";
            } else if (month == 7) {
                result = "July";
            } else if (month == 8) {
                result = "August";
            } else if (month == 9) {
                result = "September";
            } else if (month == 10) {
                result = "October";
            } else if (month == 11) {
                result = "November";
            } else {
                result = "December";
            }
        } else {
            result = "Invalid Input. Please give a number 1-12";
        }

        System.out.println(result);

        System.out.println("*******#2 Ternary ********");
        result = (month >= 1 && month <= 12) ? (month == 1) ? "January"
                : (month == 2) ? "February"
                : (month == 3) ? "March"
                : (month == 4) ? "April"
                : (month == 5) ? "May"
                : (month == 6) ? "June"
                : (month == 7) ? "July"
                : (month == 8) ? "August"
                : (month == 9) ? "September"
                : (month == 10) ? "October"
                : (month == 11) ? "November"
                : "December"

                : "Invalid";


        System.out.println(result);

        System.out.println("******#3 switch *********");
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
        System.out.println(result);

        System.out.println("*******#4 if without curly braces # *********");
        if (isValid) {
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
            System.out.println(result);
        } else {
            result = "Invalid Input. Please give a number 1-12";
        }


        scanner.close();
    }
}
