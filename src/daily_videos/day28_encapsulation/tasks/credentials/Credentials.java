package daily_videos.day28_encapsulation.tasks.credentials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isStrongPassWord(password)) {
            this.password = password;
        } else {
            System.err.println("Weak Password. Password should have at least one letter,one digits,one special character and no space!");
            System.exit(1);
        }
    }

    public boolean isStrongPassWord(String password) {
        boolean isStrong = false;
        if (password.length() >= 8 && !password.contains(" ")) {
            isStrong = true;
        }

        int numberOfDigit = 0;
        int numberOfLetter = 0;
        int numberOfSpecialCharacters = 0;

        for (char ch : password.toCharArray()) {

            if (Character.isDigit(ch)) {
                numberOfDigit++;
            } else if (Character.isLetter(ch)) {
                numberOfLetter++;
            } else if (!Character.isLetterOrDigit(ch)) {
                numberOfSpecialCharacters++;
            }
        }
        boolean digitSpaceLetterSpecial = numberOfLetter >= 1 && numberOfDigit >= 1 && numberOfSpecialCharacters >= 1;

        return isStrong && digitSpaceLetterSpecial;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
 /*             #2 Alternative of SET method  -->public void setPassword(String password) [without boolean isStrongPassword method]

        public void setPassword(String password) {
            boolean r1 = password.length() >= 8 && !password.contains(" "); // true
            boolean r3 = false; // has letter
            boolean r4 = false;  // has Digit
            boolean r5 = false; // has Special Character

            for (char each : password.toCharArray()) {
                if (Character.isLetter(each)) {
                    r3 = true;
                } else if (Character.isDigit(each)) {
                    r4 = true;
                } else {
                    r5 = true;
                }
            }
            if (r1 && r3 && r4 && r5) {
                System.err.println("Password must be strong");
                System.exit(1);
            }
            this.password = password;
        }
    */
/*         #2 Alternative of isStrongPassword(String password) method

        public boolean isStrongPassword(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" "); // true
        boolean r3 = false; // has letter
        boolean r4 = false;  // has Digit
        boolean r5 = false; // has Special Character

        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }
        return r1 && r3 && r4 && r5;
    }*/


