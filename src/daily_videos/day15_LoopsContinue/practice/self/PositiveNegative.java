package daily_videos.day15_LoopsContinue.practice.self;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int positive = 0;
        int negaitve = 0;
        while(i<5){
            System.out.println("Please enter a number:");
            int number = scanner.nextInt();
            if(number > 0){
                positive++;
            }if(number<0){
                negaitve++;
            }
        i++;
        }
        System.out.println(positive +" positive "+ negaitve + " negative" );


    }
}
