package daily_videos.day27_accessModifiers.tasks.dog;

public class TestDogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mimi","Husky","Large",'F',4,"White",true);

        System.out.println(dog1.color);

        Dog.numberOfLegs =3;
        System.out.println(Dog.numberOfEyes);
    }
}
