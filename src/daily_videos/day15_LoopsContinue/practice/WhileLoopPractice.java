package daily_videos.day15_LoopsContinue.practice;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        /* As long as age is invalid, while loop runs !
            If I enter an age which is invalid, then while loop stop running
         */
        while (!(age >= 1 && age <= 150)) {
            System.out.println("Invalid entry! Please re-enter your age:");
            age = scanner.nextInt();
        }
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        scanner.close();
    }
}
