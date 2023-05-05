package daily_videos.day31_inheritanceContinue.tasks.studentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name. Name can not be null");
            System.exit(1);
        }

        for (int i = 0; i < name.length(); i++) {
            if (!(Character.isLetter(name.charAt(i)) || Character.isSpaceChar(name.charAt(i)))) {
                System.err.println("Invalid name. Name can contain only letters and space");
                System.exit(1);
            }
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age. Age can not be negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("Invalid gender. Gender can be only 'M' OR 'F' ");
            System.exit(1);
        }
    }

    public void eat() {
        System.out.println("Person is eating");
    }

    public void drink() {
        System.out.println("Person is drinking");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}



