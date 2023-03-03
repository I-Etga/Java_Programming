package daily_videos.day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {


        // Implicit Casting SMALLER to LARGER
        byte a = 15;
        int b = a;
        short q = a;
        //short q= (short)a; we don't need casting operator() here(implicit casting).

        long d = 3000L;
        float f = d ;

        //----Explicit Casting---

        int x = 100;
        byte y = (byte) x; // If we don't use the casting operator we get error about casting!!

        float z = 20.8F; // double is the preferred type. So we add  f/F at the end.
        int h = (int)z;  // h=20 (it gives only the integer value. So it ignores the decimal part
        short v = (short)z;

        double n1 = 2.5; // it's the largest primitive data type. It can NOT be assigned to others.
        byte n2 = (byte) n1; // n1=2.5 but n2 = 2

        System.out.println("*****************");

        int num = 500;
        byte result = (byte) num; // explicit casting
        //result is now -12(according to a special calc.) Because byte is unable to have 500.


        int r = 50000;
        short m = (short)r;
        System.out.println("*************");
        double u = 3000.5;
        int i = (int)u;

                // HOW TO FIGUTE THE DATA TYOE OF A VARIABLE OUT
        System.out.println(((Object)i).getClass().getName());
        System.out.println(i);
                //DIFFERENCE IS REALLY IMPORTANT
        int e = 300;
        double o = e;
        System.out.println(((Object)o).getClass().getName());
        System.out.println(o);
        System.out.println("**************");

        float xa = 3.145f;
        double xb = xa;
        System.out.println(((Object)xb).getClass().getName());
        System.out.println(xb);

        int ll = 50_000;
        short ss= (short) ll;
        System.out.println(((Object)ss).getClass().getName());
        System.out.println(ss);











    }
}
