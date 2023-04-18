package daily_videos.day26_statics.tasks.person;


public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Mariam", 38, 'F');

        person1.eat("Hamburger");
        person1.drink("Coke");
        person1.sleep();
        System.out.println(person1);

        Person person2 = new Person("Ahmet", 21);
        System.out.println(person2);
        person2.drink("Coffee");

        person2.language = "Turkish";
        person2.gender = 'M';
        System.out.println(person2);


        Person person5 = new Person("Meryem");
        System.out.println(person5); // person.toString();


       /*
       Person person = new Person(); // If there is no constructor, default constructor created implicitly.
        System.out.println(person);
        person.gender = 'F';
        person.name = "Mariam";
        */

    }
}
