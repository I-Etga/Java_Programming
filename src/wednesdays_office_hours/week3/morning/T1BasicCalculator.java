package wednesdays_office_hours.week3.morning;

public class T1BasicCalculator {
    /*
    T1BasicCalculator [variables, operators, concatenation]

    Create a program that will define two double variables. Take the two numbers are perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3
        ...
     */

    public static void main(String[] args) {

        double numOne = 4.5;
        double numTwo = 10.2;

        System.out.println(numOne + " + " +  numTwo + " = " + (numOne + numTwo));
        System.out.println(numOne + " - " +  numTwo + " = " + (numOne - numTwo));
        System.out.println(numOne + " * " +  numTwo + " = " + (numOne * numTwo));
        System.out.println(numOne + " / " +  numTwo + " = " + (numOne / numTwo));
        System.out.println(numOne + " % " +  numTwo + " = " + (numOne % numTwo));

    }

}
