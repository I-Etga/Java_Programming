package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {

        // The median is the value in the middle of a data set !!

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Third number: ");
        int num3 = scanner.nextInt();

        int result = 0;    // this is really important !!

        boolean isNum1Median = (num3 > num1 && num1 > num2) || (num2 > num1 && num1 > num3)
                                || (num1 == num2 && num2 == num3) || ( num1 == num2 && num3 > num2)
                                || (num1==num2 && num2 >num3 );
        boolean isNum2Median = (num3 > num2 && num2 > num1) || (num1 > num2 && num2 > num3)
                                || (num2 == num3 & num2> num1) || (num2 == num3 && num2 < num1);
        boolean isNum3Median = (num1 > num3 && num3 > num2) || (num2 > num3 && num3 > num1)
                                || (num1 == num3 && num3 >num2) || (num1 == num3 && num3 < num2) ;

        if (isNum1Median){
            result = num1;
        } else if (isNum2Median) {
            result = num2;
        } else if (isNum3Median) {
            result = num3;
        }else{
            System.out.println("Invalid input. Please enter NUMBERS ONLY.");
        }
        System.out.println(result + " is median number.");
    }
}


