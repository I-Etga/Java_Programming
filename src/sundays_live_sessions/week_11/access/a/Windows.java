package sundays_live_sessions.week_11.access.a;

public class Windows extends Computer{



    public static void main(String[] args) {

        Windows windows = new Windows();
        windows.os = "Windows";
        windows.brand = "Microsoft";
        windows.memory = 8;
        // windows.hasWifiCard = true;  It's private. So I can access in different class even if it's subclass !! [However, getter/setter methods help for that !!]

    }
}

