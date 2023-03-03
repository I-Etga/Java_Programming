package daily_videos.day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Selda Yıkamacı";
        String buildingNummer = "56B";
        String streetName = "Am Schlittweg";
        String cityName = "Kaiserslautern";
        String state = "Rheinland-Pfalz";
        int zipCode = 67655;

        System.out.println("Your shipping address is: ");
        System.out.println("\t" + name );
        System.out.println("\t" + buildingNummer + " " + streetName);
        System.out.println("\t" + cityName + " "+ state + " " + zipCode );
    }
}
