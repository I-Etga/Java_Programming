package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number 1-12: ");
        int month = scanner.nextInt();

        String result = "";

        boolean has28Days = month ==2;
        boolean has30Days = month ==4 || month == 6 || month == 9 || month ==11;
        //boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
            //or we can do it that way
        boolean has31Days = !has28Days && !has30Days && month>=1 && month <=12;

        if (has28Days){
            System.out.println("28 Days");
        } else if (has30Days) {
            System.out.println("30 Days");
        } else if (has31Days) {
            System.out.println("31 Days");
        } else {
            System.out.println("Invalid Input. Please give a number 1-12");
        }

        System.out.println("***********************");


        if (has28Days){
            System.out.println("28 Days");
        } else if (has30Days) {
            System.out.println("30 Days");
        } else if (has31Days) {
            System.out.println("31 Days");
        } else {
            System.out.println("Invalid Input. Please give a number 1-12");
        }

        System.out.println("***********************");


        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
            result = "31 Days";
        } else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
            result = "30 Days";
        } else if (month == 2) {
            result = "28 Days";
        } else {
            result = "Invalid Input. Please give a number between 1-12";
        }
        System.out.println(result);
    }
}
