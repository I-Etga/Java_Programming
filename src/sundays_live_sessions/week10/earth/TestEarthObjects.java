package sundays_live_sessions.week10.earth;

public class TestEarthObjects {
    public static void main(String[] args) {
        Earth earth = new Earth(); // all variables are instance. So we can't access to them through object name, instead throug class Name.

        System.out.println(Earth.planet);
        System.out.println(Earth.asia);
        System.out.println(Earth.europe);
    }

}
