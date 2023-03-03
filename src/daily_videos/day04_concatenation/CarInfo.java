package daily_videos.day04_concatenation;

public class CarInfo {

    public static void main(String[] args) {
        short year = 2018;
        String marke = "Toyota",
                model = "Camry";
        int miles = 50_000;
        String color = "Red";
        int price = 19_000;

        System.out.println("Car information is: ");
        System.out.println("\t" + marke + " " + model + ", " + miles + " miles," + "Red," + "$" + price + "." );
    }
}
