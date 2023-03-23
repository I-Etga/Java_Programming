package studyGroup;

import java.util.Scanner;
public class ColorPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isTrue = true;
        while (isTrue) {
            String colorsGroup = "";

            System.out.println("Please enter color1");
            System.out.print("\t>");
            String color1 = scanner.next().toLowerCase().trim();
            colorsGroup += color1;
            System.out.println(color1 + " is already selected");

            // colorsGroup = "red";
            System.out.println("Please enter color2");
            System.out.print("\t>");
            String color2 = scanner.next().toLowerCase().trim();

            while (colorsGroup.contains(color2)) {
                System.err.println("The color you've entered already exist");
                System.out.println("Please enter another color");
                System.out.print("\t>");
                color2 = scanner.next().toLowerCase().trim();
            }   // "red, "               ""+ ", "+ black
            // colorsGroup = colorsGroup + color2
            colorsGroup += ", " + color2;
            System.out.println(color2 + " is already selected");
            // "red, black"

            // colorsGroup = "red, black "
            System.out.println("Please enter color3");
            System.out.print("\t>");
            String color3 = scanner.next().toLowerCase().trim();

            while (colorsGroup.contains(color3)) {
                System.err.println("The color you've entered already exist");
                System.out.println("Please enter another color");
                System.out.print("\t>");
                color3 = scanner.next().toLowerCase().trim();
            }

            colorsGroup += ", " + color3;
            System.out.println(color3 + " is already selected");
            // colorsGroup = "red, black, purple"
            System.out.println("Here are the colors you picked: " + colorsGroup);

            System.out.println("Would you like to do it once more");
            String answer = scanner.next().toLowerCase().trim();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid answer");
                System.out.println("Please enter Yes/No");
                answer = scanner.next().toLowerCase().trim();
            }

            // isTrue = true
            if (answer.equals("no")) {
                isTrue = false; // System.exit(1) -- return;
            }
        }
    }
}
