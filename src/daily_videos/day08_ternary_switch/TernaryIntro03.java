package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class TernaryIntro03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("score");
        int score = scanner.nextInt();
        /*
        String result = "";
        if(score>=0 && score<=100){
            if ((score >=60)){
                result ="Passed";
            }else{
                result = "Failed";
            }
        }else {
            result ="Invalid Score";
        }
         */

        String result = (score >= 0 && score <= 100) ? (score >= 60 ? "Passed" : "Failed") : "Invalid Score";
        System.out.println(result);


        System.out.println("********");
        int a = scanner.nextInt();

        String day = (a >= 1 && a <= 7) ?
                (a == 1) ? "Monday"
                        : (a == 2) ? "Tuesday"
                        : (a == 3) ? "Wednesday"
                        : (a == 4) ? "Thursday"
                        : (a == 5) ? "Friday"
                        : (a == 6) ? "Saturday"
                        : "Sunday"
                : "Invalid";
        System.out.println(day);
        scanner.close();
    }
}
