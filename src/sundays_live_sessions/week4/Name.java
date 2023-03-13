package sundays_live_sessions.week4;

import java.util.Scanner;

public class Name {
    /*
    Name [Scanner, String methods]

	Create a program that will ask the user to enter their name. The name should be accepted as (first name + space + last name). The program will not be able to handle any other format

	Take the name and do two things:
		1) Print the name in correct formatting meaning the first letter of the first name and last name would be uppercase and the rest will be lowercase

		2) Print the initials of the person
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String name = input.nextLine(); // james bond
        name = name.toLowerCase();
        int spaceIndex = name.indexOf(" "); // 5
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        // String upperFirst = firstName.substring(0,1).toUpperCase(); //"" + firstName.charAt(0);
        // upperFirst = firstName.substring(0,1)
        // upperFirst = upperFirst.toUppercase();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

        String lastNameChar =  lastName.substring(0,1);
        lastNameChar = lastNameChar.toUpperCase();
        lastName = lastNameChar + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));

    }
}
