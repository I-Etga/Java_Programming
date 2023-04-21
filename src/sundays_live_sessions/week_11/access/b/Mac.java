package sundays_live_sessions.week_11.access.b;

import sundays_live_sessions.week_11.access.a.Computer;

public class Mac extends Computer {

    public static void main(String[] args) {
        Mac mac = new Mac();

        // IN DIFFERENT PACKAGE AND  SUBCLASS !!

        mac.os = "MacOS"; // it's public. --> accessible #1in the same class // #2in the same package but different class // #3 in different package #4 in the World (I don't know what that is now )
        mac.memory = 8; // it's protected. -->  accessible #1in the same class // #2in the same package but different class // #3 !! in different package only if it's SUBCLASS !!
        //mac.brand = "Apple"; // it's default -->  accessible ONLY #1 in the same class or #2 in the same package
        //mac.hasWifiCard = true; // it's private. --> accessible ONLY in the same class (exception getter/setter)
    }
}
