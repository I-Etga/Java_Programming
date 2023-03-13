package daily_videos.day14_forLoop.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        System.out.println(factorial(new Scanner(System.in).nextInt()));


        /*
            I do NOT have to use scanner method.I just want to practice it!
            so it works as well : .print(factorial(5));
         */

    }

    public static int factorial(int number){
        int factorial =1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
