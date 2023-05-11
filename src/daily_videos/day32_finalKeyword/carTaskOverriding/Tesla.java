package daily_videos.day32_finalKeyword.carTaskOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car {

    public final String owner = "Elon Mask";
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot() {
        System.out.println(getMake() + " " + getModel() + "is in self-driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }

    @Override
    public void setModel(String model) { // there is an additional condition for the tesla subclass !!

        String[] models = {"Model S", "Model Y", "Model X", "Model 3"};

        if (!Arrays.toString(models).contains(model)) {
            System.err.println("Invalid Tesla model: " + model);
            System.exit(1);
        }

        super.setModel(model); // model variable is inherited from Car class. So I have to use super keyword instead of this !!
    }

    @Override
    public void setColor(String color) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));
        if (!colors.contains(color)) {
            System.err.println("Invalid color " + color);
            System.exit(1);
        }
        super.setColor(color); // this.color = color; in super class !!
    }

    @Override
    public void setYear(int year) {
        if (year < 2008) {
            System.err.println("Invalid year " + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if (price < 50000) {
            System.err.println("Invalid price for tesla car " + price);
            System.exit(1);
        }

        super.setPrice(price);
    }
}
