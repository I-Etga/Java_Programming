package wednesdays_office_hours.week_12.candy;

public class HersheyBar extends Candy {
    public HersheyBar(int quantity, boolean containsPeanuts) {
        super("Hershey", quantity, containsPeanuts);
    }

    @Override
    public String toString() {
        return "Hershey" + "{" + getClass().getSimpleName() + ", quantity" + quantity +
                ", containsPeanuts=" + containsPeanuts +
                '}';
    }
}
