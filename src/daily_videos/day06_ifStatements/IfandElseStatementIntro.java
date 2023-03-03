package daily_videos.day06_ifStatements;

import java.util.Scanner;

public class IfandElseStatementIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        if(age >= 21){
            System.out.println("Eligible");
        }
        if(age < 21){
            System.out.println("Not Eligible");
        }


         // the function and output are identical but the if/else is so much easier and short .
                        // That's why if/else is preferred !
        System.out.println("****** IF/ELSE ALTERNATIVE*********");

        if (age >= 21){
            System.out.println("Elibile");
        }else{
            System.out.println("NOT Eligible");
        }
    }
}
