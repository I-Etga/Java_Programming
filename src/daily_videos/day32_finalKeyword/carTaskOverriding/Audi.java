package daily_videos.day32_finalKeyword.carTaskOverriding;

public class Audi extends Car {

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override // it's used to verify if it's override !!
    public void start() {
        System.out.println("Press the start button to start" + getMake() + " " + getModel());
    }
}
