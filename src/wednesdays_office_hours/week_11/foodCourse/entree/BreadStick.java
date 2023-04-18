package wednesdays_office_hours.week_11.foodCourse.entree;

import wednesdays_office_hours.week_11.foodCourse.FoodCourse;

public class BreadStick extends FoodCourse {

    private boolean hasGluten;

    public BreadStick(String name, double price, boolean hasGluten) {
        super(name, price);
        this.hasGluten = hasGluten;
    }

    public boolean isHasGluten() {
        return hasGluten;
    }

    public void setHasGluten(boolean hasGluten) {
        this.hasGluten = hasGluten;
    }

    public String gluten() {
        if (hasGluten) {
            return "contain Gluten";
        } else {
            return "are Gluten-free ";
        }
    }

    public void glutenFree() {
        System.out.println("Our bread sticks " + gluten());
    }
}
