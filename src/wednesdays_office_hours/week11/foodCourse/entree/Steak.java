package wednesdays_office_hours.week11.foodCourse.entree;

public class Steak extends Entree {

    private String cookLevel;

    public Steak(String name, double price, String cookLevel) {
        super(name, price);
        this.cookLevel = cookLevel;
    }

    public String getCookLevel() {
        return cookLevel;
    }

    public void setCookLevel(String cookLevel) {
        this.cookLevel = cookLevel;
    }

    public void cookLevel() {
        System.out.println("People eats meat in Turkey mostly" + cookLevel);
    }
}
