package daily_videos.day07_IfStatements_Nested_ElseIf;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        char grade = scanner.next().charAt(0);
        String result = "";


        boolean isExcellent = grade == 'A' || grade == 'a';
        boolean isGreatJob = grade == 'B' || grade == 'b';
        boolean isGood = grade == 'C' || grade == 'c';
        boolean isPassed = grade == 'D' || grade == 'd';
        boolean isFailed = grade == 'E' || grade == 'e';

        if (isExcellent) {
            result = "Excellent";
        } else if (isGreatJob) {
            result = "Great Job";
        } else if (isGood) {
            result = "Good";
        } else if (isPassed) {
            result = "Passed";
        } else if (isFailed) {
            result = "Failed";
        } else {
            result = "Invalid Grade. Please enter a grade A-E/a-e";
        }
        System.out.println(result);
        //THE ANOTHER WAY GIVES IDENTICAL RESULT
        if (grade == 'A' || grade == 'a') {
            result = "Excellent";
        } else if (grade == 'B' || grade == 'b') {
            result = "Great Job";
        } else if (grade == 'C' || grade == 'c') {
            result = "Good";
        } else if (grade == 'D' || grade == 'd') {
            result = "Passed";
        } else if (grade == 'E' || grade == 'e') {
            result = "Failed";
        } else {
            result = "Invalid Grade. Please enter a grade A-E/a-e";
        }
        System.out.println(result);
    }
}