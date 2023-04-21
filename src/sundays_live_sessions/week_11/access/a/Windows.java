package sundays_live_sessions.week_11.access.a;

public class Windows extends Computer{



    public static void main(String[] args) {

        // IN THE SAME PACKAGE BUT IN DIFFERENT CLASS

        Windows windows = new Windows();

        windows.os = "Windows"; // it's public. --> accessible #1in the same class // #2in the same package but different class // #3 in different package #4 in the World (I don't know what that is now )
        windows.brand = "Microsoft"; // it's protected. -->  accessible #1in the same class // #2in the same package but different class // #3 !! in different package only if it's SUBCLASS !!
        windows.memory = 8; // // it's default -->  accessible ONLY #1 in the same class or #2 in the same package but different class

        // windows.hasWifiCard = true;  It's private. I can access only in the same class! So I can't access in different class even if it's subclass !! [However, getter/setter methods help for that !!]

    }
}

