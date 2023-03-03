package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number 1-12: ");
        int month = scanner.nextInt();

        boolean isJanuary = month == 1;
        boolean isFebruary = month == 2;
        boolean isMarch = month == 3;
        boolean isApril = month == 4;
        boolean isMay = month == 5;
        boolean isJune = month == 6;
        boolean isJuly = month == 7;
        boolean isAugust = month == 8;
        boolean isSeptember = month == 9;
        boolean isOctober = month == 10;
        boolean isNovember= month == 11;
        boolean isDecember = month == 12;

        if (isJanuary) {
            System.out.println("January");
        } else if (isFebruary) {
            System.out.println("February");
        } else if (isMarch) {
            System.out.println("March");
        } else if (isApril) {
            System.out.println("April");
        } else if (isMay) {
            System.out.println("May");
        } else if (isJune) {
            System.out.println("June");
        } else if (isJuly) {
            System.out.println("July");
        } else if (isAugust) {
            System.out.println("August");
        } else if (isSeptember) {
            System.out.println("September");
        } else if (isOctober) {
            System.out.println("October");
        } else if (isNovember) {
            System.out.println("November");
        } else if (isDecember) {
            System.out.println("December");
        } else {
            System.out.println("Invalid Input. Please give a number 1-12");
        }
    }
}
