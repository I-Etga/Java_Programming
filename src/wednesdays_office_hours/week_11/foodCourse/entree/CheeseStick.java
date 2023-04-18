package wednesdays_office_hours.week_11.foodCourse.entree;

import wednesdays_office_hours.week_11.foodCourse.FoodCourse;

public class CheeseStick extends FoodCourse {

    private int numberOfCheese;

    public CheeseStick(String name, double price, int numberOfCheese) {
        super(name, price);
        this.numberOfCheese = numberOfCheese;
    }

    public int getNumberOfCheese() {
        return numberOfCheese;
    }

    public void setNumberOfCheese(int numberOfCheese) {
        this.numberOfCheese = numberOfCheese;
    }

    public void stick() {
        System.out.println("They've already eaten " + numberOfCheese + "cheese sticks");
    }
}
