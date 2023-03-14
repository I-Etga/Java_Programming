package daily_videos.day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String userNameInput = scanner.next();
        System.out.println("Please enter your password: ");
        String passwordInput = scanner.next();

        String userName = "Cydeo";
        String password = "WoodenSpoon";

        if (userName.equals(userNameInput) && password.equals(passwordInput)) {
            System.out.println("Logged in ");
        } else {
            for (int i = 2; i > 0; i--) {

                System.err.println("username or password is not correct!!");
                System.out.println("Remaining attempts:" + i);

                if (i == 1) {
                    System.out.println("This is your last chance. Be careful!");
                }

                System.out.println("Please re-enter your username: ");
                userNameInput = scanner.next();
                System.out.println("Please re-enter your password: ");
                passwordInput = scanner.next();
                /*
                        !!! ATTENTION !!!
                Difference between FOR and WHILE

                # iteration = UNKNOWN[] --> WHILE
                # iteration = known how many times we need to use -->FOR

                # With while()
                int i =2 ;
                while(i<0){
                 }
                 */
                /*
                We have to use matching condition two times.(inside and outside loops)
                Because if we at the first attempt enter wrong, loops starts.

                Even if we enter the matching data, it stays in loop
                                and doesn't change the first(in case they are matching) statement.

                So we write the first if condition once more inside loop.
                 */
                if (userName.equals(userNameInput) && password.equals(passwordInput)) {
                    System.out.println("Logged in ");
                    break;
                }

                if (i == 1) {
                    System.err.println("You account now is locked.Please contact with the support team");
                }
            }
        }
        scanner.close();
    }
}
