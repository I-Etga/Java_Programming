package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public abstract class Device{
    private final String brand;
    private final String model;
    private String color;
    private final String size;
    private double price;

    private boolean hasBattery, hasPowerButton;


    public Device(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            System.out.println("Brand can't be blank,empty or null ");
            System.exit(1);
        }
        this.brand = brand;

        if (model == null || model.isBlank() || model.isEmpty()) {
            System.out.println("Model can not be blank,empty or null ");
            System.exit(1);
        }
        this.model = model;

        setColor(color);

        if (size == null || size.isBlank() || size.isEmpty()) {
            System.out.println("Size can not be blank,empty or null ");
            System.exit(1);
        }
        this.size = size;
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            System.out.println("Color can't be blank,empty or null ");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
