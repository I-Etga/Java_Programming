package other.studyGroup;

public class Shape {
    public static void main(String[] args) {

        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");
        System.out.println("******");

        System.out.println("--------");

        String str = "*";
        for (int i = 0; i < 8; i++) {
            System.out.println(str.repeat(6));
        }

        System.out.println(Divided3AndOrFive.finra(15));

    }
}
