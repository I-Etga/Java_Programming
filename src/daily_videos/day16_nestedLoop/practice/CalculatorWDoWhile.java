package daily_videos.day16_nestedLoop.practice;

import java.util.Scanner;

public class CalculatorWDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.2 ask the user enter a math operator

        double result = 0;

        do {
            System.out.println("Please enter a number");
            double number = scanner.nextDouble();
            System.out.println("Please enter a math operator");
            char operator = scanner.next().charAt(0);

            while ( !(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%')){
                System.err.println("Invalid Operator!\nPlease enter one of these operators \"+  -  /  *  % \": ");
                operator = scanner.next().charAt(0);

            /*
            as soon as while(false) is , while stops running and skips to the next line(outside while)
             */
            }

            // 1.2 is done

            // 1.3 ask the user to enter the second number

            System.out.println("Please enter your second number");
            double number2 = scanner.nextDouble();

            // 1.4 display the calculation result
            switch (operator){
                case '+':
                    result = number + number2;
                    break;
                case '-':
                    result = number - number2;
                    break;
                case '*':
                    result = number * number2;
                    break;
                case '/':
                    result = number / number2;
                    break;
                default:
                    result = number % number2;
            }
            System.out.println("result= " + result);
            //1.4 is done

            //1.5 Would you like to continue ? (yes/no)
            System.out.println("Would you like to continue? (Yes/No)");
        }while(scanner.next().equalsIgnoreCase("yes"));
    }
}

/*


 */
