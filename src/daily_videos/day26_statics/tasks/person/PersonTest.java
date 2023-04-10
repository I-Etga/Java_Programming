package daily_videos.day26_statics.tasks.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Mariam", 38, 'F');

        person1.eat("Hamburger");
        person1.drink("Coke");
        person1.sleep();
    }
}
