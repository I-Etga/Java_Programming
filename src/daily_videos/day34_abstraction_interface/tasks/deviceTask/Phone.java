package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public abstract class Phone extends Device {
    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber) {
        System.out.println(getModel() + " is calling ..." + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getModel() + " is texting to " + phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                '}'
                ;
    }
}