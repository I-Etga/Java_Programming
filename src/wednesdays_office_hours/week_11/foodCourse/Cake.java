package wednesdays_office_hours.week_11.foodCourse;

public class Cake extends FoodCourse {

    private String cakeType;

    public Cake(String name, double price, String cakeType) {
        super(name, price);
        this.cakeType = cakeType;
    }

    public String getCakeType() {
        return cakeType;
    }

    public void setCakeType(String cakeType) {
        this.cakeType = cakeType;
    }

    public void inOwen() {
        System.out.println(cakeType + " is in the owen now");
    }
}
