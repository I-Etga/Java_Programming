package wednesdays_office_hours.week_12.season;

public class Fall extends Season {
    public Fall(double highestAverageTemp, double lowestAverageTemp) {
        super(highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Read book");
    }
}
