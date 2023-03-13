package sundays_live_sessions.week2;

public class CastingExample {
    public static void main(String[] args) {

        int i = 30;
        long l = i;

        long l2 = 100; // 100 is int, int is smaller than long, so no problems, it will automatically go to long for the variable
        byte b2 = (byte)l2;

        double d3 = 15.99;
        int i3 = (int)d3;
        System.out.println(i3);

        int i4 = 1_000_000;
        byte b4 = (byte)i4; // the byte cano not hold this number, there is data loss
        System.out.println(b4); // the result is based on some calculation

        //float f5 = 10.23; // trying to store a double into a float
        float f5 = 10.23F;
        int i5 = (int)f5;
        System.out.println((double)i5);

        char letter = 'A';
        System.out.println((int)letter);

        char letter2 = 66;
        System.out.println(letter2);

        double d6 = 12.99;
        long l7 = (long)d6;
        System.out.println(l7);

    }
}
