package daily_videos.day28_encapsulation.tasks.candy;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.err.println("Quantity can not be zero or negative");
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price >= 0) {
            this.price = price;
        } else {
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String priceString() {
        if (getPrice() == 0) {
            return "free";
        } else {
            return getPrice() + "";
        }
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + priceString() +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}

