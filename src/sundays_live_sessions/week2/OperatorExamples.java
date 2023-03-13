package sundays_live_sessions.week2;

public class OperatorExamples {
    public static void main(String[] args) {

        int age = 10;
        age++;
        System.out.println(age);
        System.out.println(age++); // its prints the value of age first, then it updates
        System.out.println(age);

        int num = 5; // 6
        System.out.println(++num);
        System.out.println(num++);
        /*
                num++
                think of it as
                num
                num + 1
         */

        int x = 15;
        int y = x++;
        System.out.println("x " + x); // x = 15 -> 16
        System.out.println("y " + y); // y = 15

        int z = 90;
        int w = --z; // because this is a predecrement we subtract 1 right away
        System.out.println("z " + z); // z = 90 -> 89
        System.out.println("w " + w); // w = 89

        int a = 3; // a = 4
        int b = 5;
        a++;
        int c = a + b;
        System.out.println(c);

        /*
        a++;
        int c = a + b;

        is the same
        int c = ++a + b;
         */

    }
}
