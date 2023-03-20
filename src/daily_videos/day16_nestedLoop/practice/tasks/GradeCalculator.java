package daily_videos.day16_nestedLoop.practice.tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean isTrue = true;

        while (isTrue) {

            System.out.println("Enter you score: ");
            int score = scanner.nextInt();
            char grade = 0;

            while (!(score >= 0 && score <= 100)) {
                System.err.println("Invalid score!");
                System.out.println("Please enter a score between 0-100");
                score = scanner.nextInt();
            }

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Your grade is : " + grade);

            System.out.println("Would you like to continue? Yes/No: ");
            String yesOrNo = scanner.next().toLowerCase().trim();
            while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
                System.err.println("Invalid Entry");
                System.out.println("Please enter Yes/No");
                yesOrNo = scanner.next().toLowerCase().trim();
            }
            if (yesOrNo.equals("yes")) {
                isTrue = true;
            } else {
                System.out.println("Program is closing ...");
                System.exit(1);
            }
        }
    }
}