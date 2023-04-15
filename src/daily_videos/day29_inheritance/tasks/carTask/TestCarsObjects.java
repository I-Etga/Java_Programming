package daily_videos.day29_inheritance.tasks.carTask;

public class TestCarsObjects {
    public static void main(String[] args) {

        System.out.println("**** Toyota ****");
        Toyota yaris = new Toyota();
        yaris.setInfo("Yaris", 2021, "Red", 20000);
        yaris.setColor("Green");
        System.out.println(yaris.getPrice());
        System.out.println(yaris);

        System.out.println("**** Honda ****");
        Honda civic = new Honda();
        civic.setInfo("Civic", 2018, "White", 30000);
        civic.setYear(2022);
        System.out.println(civic.getColor());
        System.out.println(civic);

        System.out.println("**** BMW ****");
        BMW bmw3 = new BMW();
        bmw3.setInfo("320", 2018, "Green", 340000);
        bmw3.setPrice(32000);
        System.out.println(bmw3.getModel());
        System.out.println(bmw3);

        System.out.println("**** Mercedes ****");
        Mercedes s500 = new Mercedes();
        s500.setInfo("S500", 2023, "Gray", 60000);
        s500.setMake("MercedesAmg"); // I change a variable unique for s500 class. Not SuperClass Car !
        System.out.println(s500.getMake());
        System.out.println(s500.getModel());
        System.out.println(s500);

        System.out.println("**** Audi ****");
        Audi a3 = new Audi();
        a3.setInfo("A3", 2021, "White", 32000);
        a3.setModel("A4");
        System.out.println(a3.getYear());
        System.out.println(a3);


    }
}
