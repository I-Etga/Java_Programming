package daily_videos.day29_inheritance.tasks.tester;

public class TestTesterObjects {
    public static void main(String[] args) {

        // I created not only constructor , but also setInfo method to see difference !!

        Tester tester1 = new Tester("Rachel Green",'F',18,"QATest87","QA-Tester",90000);

        System.out.println(tester1);

        tester1.setInfo("Ross Geller",'M',34,"Dev863","Developer",120000);

        System.out.println(tester1);

    }
}
