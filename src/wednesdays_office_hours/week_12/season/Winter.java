package wednesdays_office_hours.week_12.season;

public class Winter extends Season {
    public Winter(double highestAverageTemp, double lowestAverageTemp) {
        super(highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use fireplace");
    }
}
