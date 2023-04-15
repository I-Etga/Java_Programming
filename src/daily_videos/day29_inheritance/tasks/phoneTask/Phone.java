package daily_videos.day29_inheritance.tasks.phoneTask;

public class Phone {
    private String brand;
    private String model;
    private double size;
    private double price;
    private String color;


    public void setInfo(String model, double size, double price, String color) {
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.out.println("Color can not be null/empty/blank");
            System.exit(1);
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.out.println("Model can not be null/empty/blank");
            System.exit(1);
        } else {
            this.model = model;
        }
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
            System.out.println("Salary can not be negative");
            System.exit(1);
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            System.out.println("Color can not be null/empty/blank");
            System.exit(1);
        } else {
            this.color = color;
        }
    }

    public void call(long phoneNumber) {
        System.out.println(model + " is calling ..." + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println( model + " is texting to " + phoneNumber);
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
