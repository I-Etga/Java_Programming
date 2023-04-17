package daily_videos.day30_inheritanceContinue.phoneTask;

public class TestPhonesObjects {
    public static void main(String[] args) {
        System.out.println("***** Apple ******");

        IPhone iPhone1 = new IPhone("14 Pro", 5.8, 1100, "White");

        //iPhone1.setColor(" "); --> Color can not be null/empty/blank

        System.out.println(iPhone1);

        iPhone1.call(653456789);
        iPhone1.text(653456789);
        iPhone1.faceTime(34356744);
        iPhone1.faceTime("IA@icloud.com");

        iPhone1.setPrice(950);

        System.out.println(iPhone1);

        System.out.println("***** Samsung ******");

        Samsung samsung1 = new Samsung("S23 Ultra", 6.9, 1300, "Black");

        samsung1.freeze();
        samsung1.setColor("White");
        samsung1.setPrice(1280);

        System.out.println(samsung1.getColor());

        System.out.println(samsung1);

        System.out.println("***** Nokia ******");

        Nokia nokia1 = new Nokia("3310", 3, 100, "Gray");

        nokia1.selfDefence();

        System.out.println(nokia1.getModel());

        System.out.println(nokia1);
    }
}
