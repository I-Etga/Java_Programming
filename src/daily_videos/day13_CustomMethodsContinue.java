package daily_videos;

public class day13_CustomMethodsContinue {
    public static void main(String[] args) {

        basicCalculator(1,6,'+');

    }

    public static void basicCalculator(int n1, int n2, char operator) {
        String result = "";
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

            System.out.println(result);
        }
    }
}
