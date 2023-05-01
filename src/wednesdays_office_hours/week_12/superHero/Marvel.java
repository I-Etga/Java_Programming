package wednesdays_office_hours.week_12.superHero;

import java.util.ArrayList;

public class Marvel extends SuperHero {
    public Marvel(String name, String realName, ArrayList<String> powers) {
        super(name, realName, powers);
    }

    public void callAvengers() {
        System.out.println("Calling all avengers");
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println(" by any means necessary");
    }
}


