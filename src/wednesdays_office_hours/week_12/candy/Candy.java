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

    public Candy( int quantity, boolean containsPeanuts) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.containsPeanuts = containsPeanuts;
    }

    @Override
    public String toString(){
        return "I have " + quantity + " " + brand + " which " + (containsPeanuts ? "has" : "doesn't have") + " peanuts";
    }
}
