package daily_videos.day16_nestedLoop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello");
        }
                /*
       System.out.println(i); outside the block is not reachable !!

              So every loop has own iteration 'i' !!
                They do NOT AFFECT EACH OTHER
                Because those 'i's are local variables!!

 */

        System.out.println("--------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"+ i);
        }
        System.out.println("---------");

        int j = 0;
        while(j<5){
            System.out.println("Hello " + j);
            j++;
        }

        System.out.println("-------");
        int k= 0;
        do {
            System.out.println("Hello " + k );
            k++;
        }while (k < 5);

        System.out.println("-------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = scanner.nextInt();

        while (score>100 || score <0){ //while the score is invalid
            System.out.println("Invalid score,please re-enter your score");
            score = scanner.nextInt();
        }
        if(score >= 60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }

}
