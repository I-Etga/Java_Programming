package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class TernariesIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("score: ");
        int score = scanner.nextInt();
        /*
        String result = "";

        if(score >= 60){
            result = "Passed";
        }else {
            result = "Failed";
        }

         */
        // result is identical but we use here TERNARY

        String result = score >= 60 ? "Passed" : "Failed";

        System.out.println(result);


        System.out.println("*********");

        int age = scanner.nextInt();

/*
        String r;
        if(age >= 21){
            r = "Eligible";
        }else{
            r = "Not Eligible";
        }
 */
        String r = age >= 21 ? "Eligible" : "Not Eligible";

        System.out.println(r);
        scanner.close();

    }
}
