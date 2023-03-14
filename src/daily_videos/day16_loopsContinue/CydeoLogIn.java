package daily_videos.day16_loopsContinue;

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
            int i = 2;
            for (i = 1; i >= 0; i--) {
                System.out.println("username or password is not correct!!\nRemaining attempts:" + i + "\nPlease re-enter your username: ");
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
                    break;}
                if (i == 0) {
                    System.out.println("You account now is locked.Please contact with the support team");
                }
            }
        }
        scanner.close();
    }
}
