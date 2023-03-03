package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class SwitchIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char grade = scanner.next().charAt(0);
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'E') {
            result = "Failed";
        } else {
            result = "Invalid Grade. Please enter a grade A-E/a-e";
        }

        System.out.println("**********");

        // if we do NOT terminate with break the switch it keeps running.
        switch (grade) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";

        }
        System.out.println(result);

        scanner.close();
    }
}