package wednesdays_office_hours.week_12.app;

public class TestAppObjects {
    public static void main(String[] args) {

        App app = new App("Facebook",9.3);
        app.download();
        System.out.println(app);

        Instgram instgram = new Instgram(4.2);
        instgram.download();  // inherited from parent class !!
        instgram.postPicture();
        System.out.println(instgram);

        Youtube youtube = new Youtube(2.5);
        instgram.download(); // inherited from parent class !!
        youtube.watchVideo();
        System.out.println(youtube);
    }
}
