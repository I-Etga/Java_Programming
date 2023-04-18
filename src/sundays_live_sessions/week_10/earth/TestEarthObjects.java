package sundays_live_sessions.week_10.earth;

import java.util.Arrays;

public class TestEarthObjects {
    public static void main(String[] args) {
        Earth earth = new Earth(); // all variables are instance. So we can't access to them through object name, instead throug class Name.

        System.out.println(Earth.planet);
        System.out.println(Earth.asia);
        System.out.println(Earth.europe);


        //Earth.northAmerica -> how to access the ArrayList
        Earth.asia.add(new Person("James", 30));
        Earth.europe.addAll(Arrays.asList(
                new Person("Anna", 20),
                new Person("Jane", 24)
        ));

        System.out.println(Earth.asia);
        System.out.println(Earth.europe);

    }
}
