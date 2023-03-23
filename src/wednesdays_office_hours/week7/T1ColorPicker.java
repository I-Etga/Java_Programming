package wednesdays_office_hours.week7;

import java.util.Scanner;

public class T1ColorPicker {
     /*
T1ColorPicker [loop, Scanner, String]
    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already. If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color. The number of iterations is not fixed
    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added
        Here are the colors you picked: red, green, orange
     */

    // our program can only handle one shade of each color

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int colors = 1;
        String selected = "Here are the colors you picked: ";

        while(colors <= 3){

            System.out.println("Enter color " + colors);
            String currentColor = input.nextLine().toLowerCase().trim();

            if(!selected.contains(currentColor)){ // true is the color is unique - String doesn't have that color yet
                selected += currentColor + ", ";
                colors++;
                System.out.println(currentColor + " added");
            } else {
                System.out.println(currentColor + " is already selected, please try again");
            }

        }

        input.close();
        System.out.println(selected.substring(0, selected.length() - 2)); // the substring removes the extra comma + space from the end

    }
}
