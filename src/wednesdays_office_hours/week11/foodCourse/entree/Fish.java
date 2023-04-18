package wednesdays_office_hours.week11.foodCourse.entree;

public class Fish extends Entree {

    private String fishType;

    public Fish(String name, double price, String fishType) {
        super(name, price);
        this.fishType = fishType;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public void season() {
        System.out.println("It's not the season of " + fishType);
    }
}
