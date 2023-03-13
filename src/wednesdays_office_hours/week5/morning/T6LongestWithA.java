package wednesdays_office_hours.week5.morning;

import java.util.Scanner;

public class T6LongestWithA {

    /*

T6LongestWithA [Scanner, String, conditional, logical]

	Create a program that will ask the user to enter 3 words. Find the word that contains 'a' and is the longest out of the others

	ex:
		java
		mouse
		computer

	Output: java

	Extra: Instead of just checking for "a" ask the enter to enter the character that should be used to determine the result

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int words = 1;
        System.out.print("Please enter word " + words++ + " ");
        String wordOne = input.next();
        System.out.print("Please enter word " + words++ + " ");
        String wordTwo = input.next();
        System.out.print("Please enter word " + words++ + " ");
        String wordThree = input.next();
        System.out.print("Please enter the letter you want to search for ");
        String search = input.next();

        String longest = ""; // apple

        if(wordOne.contains(search) && wordOne.length() > longest.length()){
            longest = wordOne;
        }

        if(wordTwo.contains(search) && wordTwo.length() > longest.length()){
            longest = wordTwo;
        }

        if(wordThree.contains(search) && wordThree.length() > longest.length()){
            longest = wordThree;
        }

        if(longest.isEmpty()){
            System.out.println("None of those words contained " + search);
        } else {
            System.out.println("Longest is " + longest);
        }

    }
}

/*      // original

        Scanner input = new Scanner(System.in);
        int words = 1;
        System.out.print("Please enter word " + words++ + " ");
        String wordOne = input.next();
        System.out.print("Please enter word " + words++ + " ");
        String wordTwo = input.next();
        System.out.print("Please enter word " + words++ + " ");
        String wordThree = input.next();

        String longest = ""; // apple

        if(wordOne.contains("a") && wordOne.length() > longest.length()){
            longest = wordOne;
        }

        if(wordTwo.contains("a") && wordTwo.length() > longest.length()){
            longest = wordTwo;
        }

        if(wordThree.contains("a") && wordThree.length() > longest.length()){
            longest = wordThree;
        }

        if(longest.isEmpty()){
            System.out.println("None of those words contained a");
        } else {
            System.out.println("Longest is " + longest);
        }
 */
