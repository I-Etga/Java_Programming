package daily_videos.day14_forLoop.practice;

import java.util.Scanner;

public class SumOfARange {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        System.out.println("total is: "+ sumOfARange(new Scanner(System.in).nextInt()));
    }

    public static int sumOfARange(int number){
        int sum = 0;
        for (int i = 0; i <= number ; i++) {
            sum += i;
        }
        return sum;
    }
}
