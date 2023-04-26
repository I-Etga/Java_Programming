package wednesdays_office_hours.week_12.season;

public class Summer extends Season {
    public Summer(double highestAverageTemp, double lowestAverageTemp) {
        super(highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink lemonade");
    }
}
