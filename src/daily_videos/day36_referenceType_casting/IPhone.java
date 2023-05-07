package daily_videos.day36_referenceType_casting;

import java.util.Arrays;

public class IPhone {

    private String brand, model, size, color;
    private double price;

    public IPhone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Blue", "Red", "Gray"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else {
            System.err.println("Invalid color: " + color + "\n color of the can only be : " + Arrays.toString(colors));
            System.exit(1);
        }

    }

    public void call(long phoneNumber) {
        System.out.println(getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getModel() + " is texting to " + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        // #1 Check if it's iphone object !![equals methods takes any object as argument]

        if (!(obj instanceof IPhone)) { // if the given object is not Iphone
            System.err.println("Invalid object, Object must be Iphone");
            System.exit(1);
           /*   if given obj is not obj of Iphone, terminates the program, and it stops running !!
                That's why I don't have to check if it's Iphone object anymore in that method !!
                        */
        }

        //#2 check the model and color
        if (model.equals(((IPhone) obj).model)) { // if the model of the Iphone is equal to the given Iphone' model
          /*
            if(color.equals( ( (IPhone)obj ).color  )   ){ // if the color of the Iphone is equal to the given iphone' color
                return true;
            }
           */

            return true;
        }


        return false;
    }
}

