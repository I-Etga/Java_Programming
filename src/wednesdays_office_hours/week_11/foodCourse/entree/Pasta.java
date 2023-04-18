package wednesdays_office_hours.week_11.foodCourse.entree;

public class Pasta extends Entree {

    private boolean withTomatoSauce;

    public Pasta(String name, double price, boolean withTomatoSauce) {
        super(name, price);
        this.withTomatoSauce = withTomatoSauce;
    }

    public boolean isWithTomatoSauce() {
        return withTomatoSauce;
    }

    public void setWithTomatoSauce(boolean withTomatoSauce) {
        this.withTomatoSauce = withTomatoSauce;
    }

    public String pastaW() {
        if (withTomatoSauce) {
            return "with tomato sauce";
        } else {
            return "with pesto sauce";
        }
    }

    public void orderPasta() {
        System.out.println("Pasta " + pastaW() + " is already ordered");
    }
}
