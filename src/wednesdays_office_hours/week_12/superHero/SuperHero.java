package wednesdays_office_hours.week_12.superHero;

import java.util.ArrayList;

public class SuperHero {

    private String name,realName,universe;
    private ArrayList<String> powers;

    public SuperHero(String name, String realName, ArrayList<String> powers) {
        this.name = name;
        this.realName = realName;
        this.universe = getClass().getSimpleName();
        this.powers = new ArrayList<>(powers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

    public void protect(){
        System.out.print(name + "is protecting");
    }
    public void callAvengers(){
        System.out.println("Calling all avengers");
    }

    @Override
    public String toString(){
        return name + " from " + universe + ". They have these powers:\n" + powers;
    }
}


