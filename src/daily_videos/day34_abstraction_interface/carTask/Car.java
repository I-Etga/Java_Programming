package daily_videos.day34_abstraction_interface.carTask;

public abstract class Car {
    /* Car Class is meant to be only inherited, can not be instantiated(creating objects).
       final method has to be initialized. Because there is no default value for it.
       final method has no set method !! Because it's unchangeable !*/
    private final String make, model;// it's final -> no setter

    private String color;

    private final int year;// it's final -> no setter
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the car
        this.model = model;
        setColor(color);
       /*
          Year is a final variable. So it does not have setter.
          That's why I set a condition like setter method inside constructor !!

          However , as long as we can write setter, we should use it, not constructor !!
          Because, constructor is called only when we create an object.
          When we want to change the value of variable, we can't use it constructor, we have to use setter.
*/
        if (year < 1986) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop() { // to make sure that non-sub classes outside the package to be accessible
        System.out.println("Press the breake to stop " + make + " " + model);
    }

    protected abstract void start(); // we can't use here final keyword.
    // Abstract method is meant to be overridden and final,static,private prevents that !!


    @Override
    public String toString() {
        return make + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
