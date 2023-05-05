package daily_videos.day35_polymorphism.transportationTask;

public abstract class Transportation { // I'll use that class as only parent class. I can't create objects of that abstract class.

    private final String make, model;
    /*  For final variables, we can't create setter method. Because final is unchangeable.
        However, if we don't initialize final variable right away declaration, we get compiler error.
        That's why we must initialize it in constructor.
        Because final variables doesn't have default values !!
           */
    private final int year;
    private String color;


    public Transportation( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    private double price;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void transportPeople();
    /*      abstract method can not have body. So no curly braces { }  !!
            abstract methods ignores details. It does not worry about how it should be completed.
    */

    public abstract void start();

    public void stop(){ // abstact class can also have instances methods.
        System.out.println("Shut off the engine ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
