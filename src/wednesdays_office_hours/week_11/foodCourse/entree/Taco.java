package wednesdays_office_hours.week_11.foodCourse.entree;

public class Taco extends Entree {

    private String typeOfMeat;

    public Taco(String name, double price, String typeOfMeat) {
        super(name, price);
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public void loveTaco() {
        System.out.println("Everybody love " + typeOfMeat + " in taco");
    }
}
