package daily_videos.day07_IfStatements_Nested_ElseIf;

import java.util.Scanner;

public class IfStatementWithOutCurlyBraces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int age = 32;

       if(age >= 21){
           System.out.println("Eligible");
       } else {
           System.out.println(  "Not Eligible");
       }

        System.out.println("**************");

        // WITHOUT CURLY BRACES
         // IT IS OPTIONAL
        //ONLY POSSIBLE IF THERE IS ONLY ONE BLOCK IN IF STATEMENT
       if(age >= 21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("********");

        int itemNum = scanner.nextInt();

        if(itemNum ==1){
            System.out.println("Eggs");
            System.out.println("Orange");
        }else if (itemNum ==2){
            System.out.println("Milk");
            System.out.println("Onion");
        }else{
            System.out.println("Apple");
            System.out.println("Cherry");
        }

                // EXAMPLE OF IF STATEMENT WITHOUT CURLY BRACES
        System.out.print("Give the number of today: ");
        int day = scanner.nextInt();

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");

        scanner.close();
    }
}
