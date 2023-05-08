package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

import java.time.LocalDate;

public abstract class Car {
    /*
        meant to be super class
        No object can be created from that class !!
        constructor √
        abstract method √
        final[Class], static, private X
                         */

    private final String make, model;
    private final LocalDate year;// final methods can have set method !!
    /*
    #1 Final variables has no default value. They have to be initialized before getting executed.
        !! Instances variables are initialized implicitly to default value. Final variables are not !!

    #2 Final variables can not change. So they don't have setter !!
        That's why we have some options to initialize them.
            #1 right away declaration // Line 15
            #2 in constructor // line 26
            we have to choose one of the initialize ways btw !!

    #3 Since final variables have no setter, I have to write my variables conditions in constructor , instead of setter methods !!
     */

    public Car(String make, String model, double price, String color, LocalDate year) {
        if (make == null || make.isEmpty() || make.isBlank()) { // Normally I'd write that condition inside setMake(make) method. But it's final and has not set method.
            System.err.println("Make can not be null/empty/blank");
            System.exit(1);
        }
        this.make = make;
        ////
        if (model == null || model.isEmpty() || model.isBlank()) { // Normally I'd write that condition inside setModel(model) method. But it's final and has not set method.
            System.err.println("Model can not be null/empty/blank");
            System.exit(1);
        }
        this.model = model;
        ////
        if (year.isBefore(LocalDate.of(1886, 1, 1))) {
            System.err.println("Year can not be less 1886");
            System.exit(1);
        }
        this.year = year;

        setPrice(price);
        setColor(color);

    }

    private double price;
    private String color;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Price can not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}