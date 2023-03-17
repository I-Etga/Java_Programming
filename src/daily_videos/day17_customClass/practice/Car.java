package daily_videos.day17_customClass.practice;

public class Car {


    public String marke;
    public String model;
    public int year;
    public String color;
    public double price;

    public String toString() {
        return "CaR{" +
                "marke='" + marke + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void setInfo(String marke, String model, int year, String color, double price) {
        this.marke = marke;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void start() {
        System.out.println("");
    }
}


