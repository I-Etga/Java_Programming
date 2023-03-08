package wednesday_office_hours.week05;

import java.util.Scanner;

public class T6LongesWithA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int words = 1;
        /*
                You don't have to write word1 2 3
                    we can use word++
         */
        System.out.print("Please enter a word" + words++ + ": ");
        String wordOne = scanner.next();
        System.out.print("Please enter a word" + words++ + ": ");
        String wordTwo = scanner.next();
        System.out.print("Please enter a word" + words++ + ": ");
        String wordThree = scanner.next();
        System.out.print("Please enter the letter you want to search for: ");
        String search = scanner.next();

        String longest = "";
        /*          java executes top to bottom.
                    -So every single time the if condition is true,
                   -the value of String longest and length of it updated.
         */
        if (wordOne.contains(search) && wordOne.length() > longest.length()) {
            longest = wordOne;
        }

        if (wordTwo.contains(search) && wordTwo.length() > longest.length()) {
            longest = wordTwo;
        }
        if (wordThree.contains(search) && wordThree.length() > longest.length()) {
            longest = wordThree;

            if (longest.isEmpty()) {
                System.out.println("None of those words contained " + search);
            }
        }
        System.out.println("Longest is " + longest);
    }
}
/*
T6LongestWithA [Scanner, String, conditional, logical]

    Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others

    ex:
        java
        mouse
        computer

    Output: java

    Extra: Instead of just checking for "a" ask the enter
    to enter the character that should be used to determine the result
 */
