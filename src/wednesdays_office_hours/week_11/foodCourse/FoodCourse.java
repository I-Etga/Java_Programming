package wednesdays_office_hours.week_11.foodCourse;

public class FoodCourse {

    private String name;
    private double price;

    public FoodCourse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
