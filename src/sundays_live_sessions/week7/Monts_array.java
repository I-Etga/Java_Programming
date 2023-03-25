package sundays_live_sessions.week7;

import java.util.Scanner;

public class Monts_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {"January", "February", "March","April", "May","June","July", "August","September","October","November","December"};

        System.out.println("Please enter the number of month: ");
        int month = scanner.nextInt();

        System.out.println(months[month-1]);


    }
}

