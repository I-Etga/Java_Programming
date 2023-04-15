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

        char[] chars = password.toCharArray();
        int numberOfDigit = 0;
        int numberOfLetter = 0;
        int numberOfSpecialCharacters = 0;

        for (char ch : chars) {

            if (Character.isDigit(ch)) {
                numberOfDigit++;
            } else if (Character.isLetter(ch)) {
                numberOfLetter++;
            } else if (!Character.isLetterOrDigit(ch)) {
                numberOfSpecialCharacters++;
            }
        }
        boolean digitSpaceLetterSpecial = numberOfLetter >= 1 && numberOfDigit >= 0 && numberOfSpecialCharacters >= 0;

        return isStrong && digitSpaceLetterSpecial;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


