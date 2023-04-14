package sundays_live_sessions.week10.earth;

import java.util.ArrayList;
import java.util.Arrays;

public class Earth {
    public static String planet ;
    public static double size ;
    public static ArrayList< Person> asia;

    public static ArrayList< Person> europe;

    static {
        planet = "Earth";
        size = 40.075;

        Person person1 = new Person("Ahmet",15);
        Person person2 = new Person("Ayse",21);
        asia = new ArrayList<>(Arrays.asList(person1,person1));


        Person person3 = new Person("Kerim",9);
        Person person4 = new Person("John",45);
        europe = new ArrayList<>(Arrays.asList(person3,person4));

    }


}

