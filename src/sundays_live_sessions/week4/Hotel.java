package sundays_live_sessions.week4;

import java.util.Scanner;

public class Hotel {
    /*
    Hotel [scanner, conditional, operators]

	Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

	Go through the following flow:

		Welcome to the Java Hotel
		How many days will you stay
		-> read number of days from console
		How many people are in your party
		-> read number of people from console

	In addition declare these variables:
		price, room type

	Use the information gathered to assign a room to the guests and print the information

	Data:
		number of people: 1
		assigned to a single room
		price is: number of days staying * 100

		number of people: 2
		assigned to a double room
		price is: number of days staying * 125

		number of people: 3 or 4
		assigned to a large room
		price is: number of days staying * number of people * 50

		number of people: 5 or 6
		assigned to a suite
		price is: number of days staying * 1000

		any other number of people is invalid and should output:
			sorry $number_of_people is not a valid group size

     */

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the java hotel\nHow many days will you stay");
        int numOfDays = keyboard.nextInt();
        System.out.println("How many people are in your party");
        int numOfPeople = keyboard.nextInt();
        keyboard.close();

        double price = 0;
        String roomType = "";
        boolean isValid = true;

        switch (numOfPeople) {
            case 1:
                roomType = "Single Room";
                price = numOfDays * 100;
                break;
            case 2:
                roomType = "Double Room";
                price = numOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "Large Room";
                price = numOfDays * numOfPeople * 50;
                break;
            case 5:
            case 6:
                roomType = "Suite";
                price = numOfDays * 1000;
                break;
            default:
                System.out.println("Sorry " + numOfPeople + " is not a valid group size");
                isValid = false;
        }

        if(isValid){
            System.out.println("You are assigned to a " + roomType + " for days " + numOfDays + " so your total comes to $" + price);
        }

    }

}

/*

    if(numOfDays > 0 && (numOfPeople >= 1 && numOfPeople <= 6)){
        switch (numOfPeople) {
            case 1:
                roomType = "Single Room";
                price = numOfDays * 100;
                break;
            case 2:
                roomType = "Double Room";
                price = numOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "Large Room";
                price = numOfDays * numOfPeople * 50;
                break;
            case 5:
            case 6:
                roomType = "Suite";
                price = numOfDays * 1000;
                break;
        }
    } else {
       System.out.println("Sorry " + numOfPeople + " is not a valid group size");
        // can also use more if statements here to show why it is valid. check for day one and people one
    }
 */