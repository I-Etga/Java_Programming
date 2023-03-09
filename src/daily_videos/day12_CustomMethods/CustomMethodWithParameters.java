package daily_videos.day12_CustomMethods;

import java.util.Scanner;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 37;

        int age1 = 54;
        int age2 = 17;

        oddOrEven(10);
        oddOrEven(12);
        oddOrEven(num1);
        oddOrEven(num2);

        System.out.println("***************");

        isEligibleToBuyAlcohol(13);
        isEligibleToBuyAlcohol(-78);
        isEligibleToBuyAlcohol(age1);
        isEligibleToBuyAlcohol(age2);
/*
                parameter's name should be meaningful.
            Because if you type a value, it displays the name of parameter

               If we pass  a parameter to a method;
               We have to enter a value.Otherwise, it fails ! we get error message.
 */

    }

    public static void oddOrEven(int number) {

        String message = "";

        if (number % 2 == 0) {
            message = number + " is even number";
        } else {
            message = number + " is odd number";
        }
        System.out.println(message);
    }

    public static void isEligibleToBuyAlcohol(int age) {
        String message = "";

        if (age > 0 && age < 120)
            if (age < 18) {
                message = "Not eligible to buy alcohol";
            } else {
                message = "eligible to buy alcohol";
            }
        else {
            message = "invalid";
        }
        System.out.println(message);

    }
}
