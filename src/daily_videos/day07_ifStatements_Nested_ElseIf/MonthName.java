package daily_videos.day07_ifStatements_Nested_ElseIf;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of the month 1-12: ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12)
            if (month == 1) {
                System.out.println("January");
            } else if (month == 2) {
                System.out.println("February");
            } else if (month == 3) {
                System.out.println("March");
            } else if (month == 4) {
                System.out.println("April");
            } else if (month == 5) {
                System.out.println("May");
            } else if (month == 6) {
                System.out.println("June");
            } else if (month == 7) {
                System.out.println("July");
            } else if (month == 8) {
                System.out.println("August");
            } else if (month == 9) {
                System.out.println("September");
            } else if (month == 10) {
                System.out.println("October");
            } else if (month == 11) {
                System.out.println("November");
            } else {
                System.out.println("December");
            }
        else {
            System.out.println("Invalid Input. Please give a number 1-12");
        }

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
    }
}
