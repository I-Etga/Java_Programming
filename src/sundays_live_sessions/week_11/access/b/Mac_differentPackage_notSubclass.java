package sundays_live_sessions.week_11.access.b;

public class Mac_differentPackage_notSubclass {
    public static void main(String[] args) {

        Mac mac = new Mac();

        // in different package but NOT SUBCLASS --> ONLY PUBLIC  can be accessible !!

        mac.os = "MacOS"; // it's public. --> accessible #1in the same class // #2in the same package but different class // #3 in different package #4 in
        //mac.memory = 8; // it's protected. -->  accessible #1in the same class // #2in the same package but different class // #3 in different package only if it's SUBCLASS
        //mac.brand = "Apple"; // it's default -->  accessible #1 in the same class or #2 in the same package
        //mac.hasWifiCard = true; // it's private. --> only accessible in the same class (exception getter/setter)
    }
}
