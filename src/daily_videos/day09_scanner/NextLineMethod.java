package daily_videos.day09_scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine(); // Harry Potter + enter (nextLine can read all )

        System.out.println("School Name: ");
        String schoolName = scanner.nextLine(); // Cydeo + enter (nextLine can read all )

        System.out.println("Gender");
        String gender = scanner.next();

        /*
         because genders are one word. // Male + enter
         However next() method can not the read all of them. Only until space !!
         Where will go "enter" then ? to the memory of Scanner
         */

        System.out.println("What is you age ?");
        int age = scanner.nextInt();

        scanner.nextLine();
                                /*
                                  in this case, it will NOT allow us to enter the street name !
                                       So we use empty nextLine() method before the necessary nextLine()
                                                to get rid of "enter"
                                           (In other words = clear out the scanner)

                                                THAT EMPTY scanner.nextLine() thing WE NEED ONLY
                                                    IF WE USE .nextLine() AFTER ANY OTHER NEXT..() METHOD.
                                 */
        System.out.println("Enter your street name: ");
        String streetName = scanner.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("streetName = " + streetName);

        scanner.close();
    }
}
