package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class TernarySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("score:");
        int score = scanner.nextInt();
        String result = "";

        if (score >= 0 && score <= 100) {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        } else {
            result = "Invalid";

        }
        System.out.println(result);

        System.out.println("************");
        System.out.println(" 2 EXAMPLE IN DIFFERENT WAY BUT IDENTICAL RESULT");
        System.out.println("************");

        String result2 = (score >= 0 && score <= 100) ?
                result2 = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F"
                //this above given a block is inner if statement BUT TERNARY type!
                : "Invalid";
        // 1st and 3rd lines are outer if statement BUT TERNARY type !
        System.out.println(result2);

        scanner.close();
    }
}