package daily_videos.day29_inheritance.tasks.developer;

public class TestDeveloperObjects {
    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("Ted Mosby",'M',45,"Dev1293","Developer",100000,"C#-");
        // setInfo methods checks if arguments are valid based on conditions , given in setters !
        System.out.println(developer1);
    }
}

