package daily_videos.day30_inheritanceContinue.phoneTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Phone_superClass {
    private String brand;
    private String model;
    private double size;
    private double price;
    private String color;


    public Phone_superClass(String brand, String model, double size, double price, String color) { // Because constructors named after Class, they can not be inherited to child class !
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price can not be negative");
            System.exit(1);
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "color of the phone can only be: " + Arrays.toString(colors));
            System.exit(1);
        }
    }

    public void call(long phoneNumber) {
        System.out.println(model + " is calling ..." + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(model + " is texting to " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
