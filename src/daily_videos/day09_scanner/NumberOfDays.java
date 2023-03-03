package daily_videos.day09_scanner;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of month: ");
        int month = scanner.nextInt();
        String result = "";


        // switch DOES NOT accept BOOLEAN !!
        // NOW WE ARE GOING TO APPLY OR STATEMENT ON SWITCH !!

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 Days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 Days";
                break;
            default:
                result = "Invalid";
        }


        System.out.println(result);
        scanner.close();
    }
}
