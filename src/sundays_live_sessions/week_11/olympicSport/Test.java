package sundays_live_sessions.week_11.olympicSport;

public class Test {
    public static void main(String[] args) {

        Surfing surfing = new Surfing("Antalya",8);
        surfing.participants = 10;
        System.out.println(Surfing.yearOfFirstOlympics); // static variable is called through Class name !!
        surfing.compete();
        System.out.println(surfing); // toString method is being called !!



        Track track = new Track("Berlin",65);
        track.name = "Paris";
        Track.yearOfFirstOlympics = 2002; // static variable is called through Class name !!
        track.compete();
        System.out.println(track);


        Soccer soccer = new Soccer("USA",22);
        soccer.name = "Canada";
        System.out.println(Soccer.yearOfFirstOlympics); // static variable is called through Class name !!
        soccer.compete();
        System.out.println(soccer);

    }
}
