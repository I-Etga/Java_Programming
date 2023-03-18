package daily_videos.day17_customClass.practice.practice;

public class Car {
    public String marke;
    public String model;
    public int year;
    public String color;
    public double price;


    public void setInfo(String marke, String model, int year, String color, double price) {
        this.marke = marke;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marke='" + marke + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.printf( new Car().model + " is now on the highway!!");
    }
}


/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()
 */