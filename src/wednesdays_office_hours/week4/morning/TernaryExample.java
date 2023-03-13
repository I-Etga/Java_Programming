package wednesdays_office_hours.week4.morning;

public class TernaryExample {
    public static void main(String[] args) {

        boolean valid = true;

        int a = valid ? 5 : 10;
        System.out.println(a);

        System.out.println(valid ? 5 : 10);

        System.out.println(valid ? "Hello" : "World");
        /*
        if(valid){
            result = "Hello"
        } else {
            result = "World";
        }
         */

    }
}
