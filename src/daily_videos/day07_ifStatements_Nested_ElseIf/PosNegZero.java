package daily_videos.day07_ifStatements_Nested_ElseIf;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("number: ");
        int number = scanner.nextInt();
        String result = "";
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if(isPositive){
            result = "Positive";
        } else if (isNegative) {
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);
        scanner.close();
    }
}
