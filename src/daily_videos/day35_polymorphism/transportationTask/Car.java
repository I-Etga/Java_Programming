package daily_videos.day35_polymorphism.transportationTask;

public  class Car extends Transportation {

    public Car(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

       /*   There are two abstract methods in Transportation abstract Class.
        I have to implement that two abstract method, after I extend Transportation class.
        Otherwise, I get compiler error.
            */

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    public void drive() {
    }
}
