package daily_videos.day07_IfStatements_Nested_ElseIf;

import java.util.Scanner;

public class NestedIfIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your score: ");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }

        System.out.println("*********");
        System.out.println("your age:" );
        int age = scanner.nextInt();

        if (age >= 1 && age <= 150) {
            if (age >= 18) {
                System.out.println("is Eligible");
            } else {
                System.out.println("not Eligible");
            }
        } else {
            System.out.println("Invalid Age");
        }

        System.out.println("**********");
        System.out.println("day: ");
        int day = scanner.nextInt();

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

    scanner.close();
    }
}
