package daily_videos.day15_loopsContinue.practice;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -2147483647; // this is the smallest integer.
        /* if we use 0 , it won't work properly, when I enter all the number negative.
                  In this case it works positive and negative numbers !!
                         */
        for (int i = 0; i <5  ; i++) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            /*
             As long as loops runs, the value of max will be updated.
              of course only if new entry is greater than current number.
                    max number stays max until entering a grater number!!
             */
            if(num> max){
                max = num;
            }
        }
        System.out.println("max= " + max);
    }
}
