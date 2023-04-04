package daily_videos.day07_ifStatements_Nested_ElseIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your score 1~100: ");
        int score = scanner.nextInt();
        String result = "";

        if (score >= 90) {
            result = "Your grade is A";
        } else if (score >= 80 ) {
            result = "Your grade is B";
        } else if (score >= 70 ) {
            result = "Your grade is C";
        } else if (score >= 60 ) {
            result = "Your grade is D";
        } else if (score>=0 ){
            result = "Your grade is F";
        } else {
            result = "Invalid Grade. Please enter a score 0~100";
        }
        System.out.println(result);
    }
}
