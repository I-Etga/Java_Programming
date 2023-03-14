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

                int i =2 ;
                while(i<0){
                 }
                 */
                if (i == 0) {
                    System.out.println("You're banned to log in!! ");
                }
            }
        }
        scanner.close();
    }
}
