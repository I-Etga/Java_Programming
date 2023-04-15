package daily_videos.day29_inheritance.tasks.vocationsTask;

public class TestVocationsObjects {
    public static void main(String[] args) {

        System.out.println("***** Tester *****");
        // I created not only constructor , but also setInfo method to see difference !!

        Tester tester1 = new Tester("Rachel Green", 'F', 18, "QATest87", "QA-Tester", 90000);

        System.out.println(tester1);

        tester1.setInfo("Ross Geller", 'M', 34, "Dev863", "Developer", 120000);

        System.out.println(tester1);

        tester1.testing();

        System.out.println("***** Developer *****");
        Developer developer1 = new Developer();
        developer1.setInfo("Ted Mosby", 'M', 45, "Dev1293", "Developer", 100000, "C#");
        // setInfo methods checks if arguments are valid based on conditions , given in setters !
        System.out.println(developer1);

        developer1.coding();

        System.out.println("***** Driver *****");

        Driver driver1 = new Driver();

        driver1.setInfo("Ranjit Singh", 'M', 56, "D512", "Taxi/Limo Driver", 65000);

        System.out.println(driver1);

        driver1.setAge(58);
        driver1.setSalary(90000);

        System.out.println(driver1);

        driver1.drive();

        System.out.println("***** Teacher *****");
        Teacher teacher1 = new Teacher();
        teacher1.setInfo("James Tailor", 'M', 38, "T41", "Techer", 75000);

        System.out.println(teacher1);
        System.out.println(teacher1.getAge());

        teacher1.setAge(56);
        System.out.println(teacher1.getAge());

        teacher1.teaching();
    }
}
