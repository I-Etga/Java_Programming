package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        /* As long as age is invalid, while loop runs !
            If I enter an age which is VALID, then while loop stop running
         */

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid entry! Please re-enter your age:");
            age = scanner.nextInt();
        }
        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = scanner.next();

        while (!((yesOrNo.equalsIgnoreCase("yes")) || (yesOrNo.equalsIgnoreCase("no")))) {
            System.err.println("Invalid Entry! Please re-enter:");
            System.out.println("Are you a US citizen? Yes/No");
        }
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        scanner.close();
    }
}
