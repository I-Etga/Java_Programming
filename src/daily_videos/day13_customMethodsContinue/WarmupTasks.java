package daily_videos.day13_customMethodsContinue;

public class WarmupTasks {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator");
        double n1 = scanner.nextDouble(), n2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);

        basicCalculator(n1,n2,operator);
        System.out.println("*************");

        ageGroup(9);


         */
        eligibleToVote(43, false);

    }

    // the area of custom methods \\
    public static void basicCalculator(double n1, double n2, char operator) {
        String result = "";

        /*
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            if (operator == '+') {
                result = "total is= " + (n1 + n2);
            } else if (operator == '-') {
                result = "total is= " +(n1 - n2);
            } else if (operator == '*') {
                result = "total is= " + (n1 * n2);
            } else if (operator == '/') {
                result = "total is= " + (n1 / n2);
            } else {
                result = "total is= " + (n1 % n2);
            }
            System.out.println(result);
        } else {
            result = "Invalid Operator. Please choose only the following operators: +,-,*,/,% ";
         */

        switch (operator) {
            case '+':
                result = "total is= " + (n1 + n2);
                break;
            case '-':
                result = "total is= " + (n1 - n2);
                break;
            case '?':
                result = "total is= " + (n1 * n2);
                break;
            case '/':
                result = "total is= " + (n1 / n2);
                break;
            case '%':
                result = "total is= " + (n1 % n2);
                break;
            default:
                System.err.println("Invalid Operator"); // print error message in red colour
        }
        System.out.println(result);
    }

    public static void ageGroup(int age) {
        String message = "";
        if (age < 21) {
            message = "Teenager";
        } else if (age >= 21 && age < 55) {
            message = "Adult";
        } else {
            message = "Senior";
        }
        System.out.println(message);
    }

    public static void eligibleToVote(int age, boolean isAmerican) {
        String message = "";
        if (age >= 21 && isAmerican) {
            message = "You are eligible to vote";
        } else {
            message = "You are not eligible to vote";
        }
        System.out.println(message);
    }


}



