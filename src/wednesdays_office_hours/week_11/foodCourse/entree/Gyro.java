package wednesdays_office_hours.week_11.foodCourse.entree;

public class Gyro extends Entree {

    private double portion;

    public Gyro(String name, double price, double portion) {
        super(name, price);
        this.portion = portion;
    }

    public double getPortion() {
        return portion;
    }

    public void setPortion(double portion) {
        this.portion = portion;
    }

    public void portion() {
        System.out.println(portion + " of gyro is to much for one person");
    }
}
