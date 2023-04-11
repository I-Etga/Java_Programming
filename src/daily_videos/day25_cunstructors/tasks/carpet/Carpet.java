package daily_videos.day25_cunstructors.tasks.carpet;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {

        double price = (width * length) * unitPrice;
        if (isPersian) {
            price += 200;
        }
        return price;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", price=" + calcCost() +
                '}';
    }
}
