package daily_videos.day27_accessModifiers.tasks.person;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Katerina", 34, 'F', "russian");
        person1.age = 44;
        System.out.println(person1);

        Person.planet = "Mars";
        System.out.println(Person.numbeOfWings);
    }
}
