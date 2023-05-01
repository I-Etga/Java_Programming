package wednesdays_office_hours.week_12.superHero;

import java.util.ArrayList;

public class DC extends SuperHero {
    private String city;

    public DC(String name, String realName, ArrayList<String> powers, String city) {
        super(name, realName, powers);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println(" with honor");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
