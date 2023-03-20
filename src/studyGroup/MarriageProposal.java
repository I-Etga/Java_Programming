package studyGroup;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Will you marry me?Yes/No");
        String answer= scanner.next().toLowerCase().trim();

        //n            !( false         ||      false) --> !false --> true
        //yes           !( true         || false) --> !true --> false while loop stops and jump to the next part

        while(!( answer.equals("yes")||answer.equals("no"))) {
            System.err.println("Invalid answer, please re-enter");
            answer = scanner.next().toLowerCase().trim();
        }
        // there are only two possibility which are yes or no !!
        if(answer.equals("yes")){
            System.out.println("congrats");
        } else {
            System.out.println("Goodbye...");
        }
    }
}
