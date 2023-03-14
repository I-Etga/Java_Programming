package daily_videos.day15_LoopsContinue.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your second name:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter a math operator:");
        char operator = scanner.next().charAt(0);

        while(!(operator =='+' || operator =='-'|| operator =='*'|| operator =='/'|| operator =='%')){
            System.err.println("Invalid Operator.Please re-enter a valid math operator");
            operator = scanner.next().charAt(0);
        }
        double result = 0;
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }


        System.out.println("Result is: " + result);

    }


}
