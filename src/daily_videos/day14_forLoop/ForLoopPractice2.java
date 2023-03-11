package daily_videos.day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;


            // ask five times number from user and get the total number !!
        for ( int i = 1 ; i<=5;i++){
            System.out.println("Please enter a number: ");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);


            // ***FOR LOOP SHORTCUT in intellij --> fori + enter***

        }
    }

