package wednesdays_office_hours.week_12.candy;

public class Candy {
    public String brand;
    public int quantity;
    public boolean containsPeanuts;

    static int numberOfTotalCandy;
    static String countryWithLargestCandyConsume;

    static {
        numberOfTotalCandy = 500_000;
        countryWithLargestCandyConsume = "United States of America";
    }

    public Candy(String brand, int quantity, boolean containsPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.containsPeanuts = containsPeanuts;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "quantity=" + quantity +
                ", containsPeanuts=" + containsPeanuts +
                '}';
    }
}
