package daily_videos.day28_encapsulation.person;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");

        Person person2 = new Person("Abidullah", 21);

        Person person3 = new Person("Ayse", "Turkish");

        Person person4 = new Person("Merve", 24, "Turkish", 'F');

        Person person5 = new Person("John", 43, "English", 'M');

        person5.name = "Kerim"; // We can change instances of objects manually !
        //person5.planet = "Mars"; -> static variablas can't be called through object name.
        Person.planet = "Mars";// We can change static variable manually ! [can be called only through class nane]


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        Person.printPlanetName();

        person1.eat("Baklava"); //Mohammad eats Baklava

        person2.drink("Water"); // Abidullah drinks Water

        person5.drink("Tea"); // Kerim drinks Tea

        person3.sleep(); // Ayse is sleeping


    }
}
