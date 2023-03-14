package daily_videos.day15_loopsContinue.practice.self;

import java.util.Scanner;

public class MarrigeProposal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Will you marry me? Yes/No");
        String answer = scanner.next();

        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid answer. Please re-enter: Yes/No?");
            System.out.println("Will you marry me? Yes/No");
            answer = scanner.next();
        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats.");
        }else{
            System.out.println("Goodbye");
        }
    }
}
