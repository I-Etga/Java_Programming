package daily_videos.day17_customClass.practice;

public class Dog {
    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public void eat(){
        System.out.println(name + " is eating. ");
    }

    public void drink(){
        System.out.println(name + " is drinking water. ");
    }

    public void setInfo(String name, String breed, char gender, String size, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
