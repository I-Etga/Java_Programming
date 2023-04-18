package wednesdays_office_hours.week_11.foodCourse.entree;

import wednesdays_office_hours.week_11.foodCourse.FoodCourse;

public class Shrimp extends FoodCourse {

    private char size;

    public Shrimp(String name, double price, char size) {
        super(name, price);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void shrimps() {
        System.out.println(size + "shrimps are more expensive");
    }
}
