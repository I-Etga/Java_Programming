package daily_videos.day34_abstraction_interface.carTask;

public class Audi extends Car{
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    protected void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    public void autoPark(){
        System.out.println(getMake() + " " + getModel() + " ");
    }
}
