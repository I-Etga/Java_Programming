package daily_videos.day06_ifStatements;

import java.util.Scanner;

public class IfStatement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPositive = number >0;
        boolean isNegative = number <0;
        boolean isZero      = number ==0;
  /*
        if the number is not positive then the code won't be executed.
         if the number is positive then the code-the statement will be executed.
   */

        if(isPositive){
            System.out.println(number + " is positive.");
        }
        if(isNegative){
            System.out.println(number + " is negative.");
        }
        if(isZero){
            System.out.println(number + " is zero.");
        }
    }
}
