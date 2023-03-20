package sundays_live_sessions.week6;

import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        System.out.println(isPrime(new Scanner(System.in).nextInt()));


    }

    public static String isPrime(int number) {
        String primeNumber = "";

         /*
        I am going to every single number by the numbers until this numbers.
        So first loop gives me the first number and second loops will say
                            if it's divided by all number until that number.
         */

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumber += " " + i;
            }
        }
        return primeNumber;

    }
}