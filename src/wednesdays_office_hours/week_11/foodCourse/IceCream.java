package wednesdays_office_hours.week_11.foodCourse;

public class IceCream extends FoodCourse {

    private boolean inACone;

    public IceCream(String name, double price, boolean inACone) {
        super(name, price);
        this.inACone = inACone;
    }

    public boolean isInACone() {
        return inACone;
    }

    public void setInACone(boolean inACone) {
        this.inACone = inACone;
    }

    public String inACone() {
        if (inACone) {
            return "in a cone";
        } else {
            return "in a plate";
        }
    }

    public void serving() {
        System.out.println(getName() + " is serving " + inACone());
    }
}
