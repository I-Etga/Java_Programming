package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class IfandElsePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int score = scanner.nextInt();

        if (score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
