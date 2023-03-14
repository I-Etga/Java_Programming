package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;
public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max =-2147483647;//I am going to assign the SMALLEST integer that user could enter.
        int min =2147483647;//I am going to assign the LARGEST integer that user could enter.

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            if (num > max){
                max = num;
            }
            // separate if statements
            if (num < min){
                min = num;
            }
        }
        System.out.println("Minimum Number is: " + min);
        System.out.println("Maximum Number is: " + max);
    }
}
