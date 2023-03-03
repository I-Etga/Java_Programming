package sunday_live_sessions.week02;

public class CastingExample {
    public static void main(String[] args) {
        int i = 30;
        long l =i ; // long is greater than int . so converting int to long is implicit casting.
        System.out.println(l);

        long l2 = 100;
        byte b1 = (byte)l2; // now we're casting long to byte. long is greater than byte.
                            // so we have to cast explicitly.
                            //Otherwise, we get compiler error.
        System.out.println(b1);

        int i2 = 78;
        double d1 = i2;
        System.out.println(d1); // 78.0 -compiler adds .0 as decimal part.

        double d2 = 990.89363;
        int m = (int)d2;
        System.out.println(m); // output will be 990 (compiler ignores / cuts out the decimal part)

                        // EXCEPTION NUMBER 1 ( range of data for the (to )converted datatype)
                    //what if the value is out of the range of  converted data types
                                // It's course it is only possible explicit casting !!
        int i3 = 1_000_000;
        byte b2 = (byte)i3;
        System.out.println(b2); // output 64.
                // the result is basen on some calculation which we don't have to learn at all.

                    // EXCEPTION NUMBER 2 (FLOAT TO DOUBLE -adding numbers in the decimal part)
        float f5 = 10.23f;
        double d3 = f5;
        System.out.println(d3);
            // output 10.229999542236328
                // double is greater than float and that's why we've cast implicitly.
                    // but if we float to double , result will be the exact same.
        int i5 = (int)f5;
        System.out.println(i5);


        char letter = 'A';
        System.out.println((int)letter); // output = 65 (because every single character has own unique value)

                            // exception about the char
        char letter2 = 66; // it is gonna be printed B so not the number but the character !!
        System.out.println(letter2);

        double d6 = 12.99;
        long l7 =(long)d6;
        System.out.println(l7); // result 12


        double d8 = 10.229999542236328;
        float f9 = (float) d8;
        System.out.println(f9); // result ist = 10.23 . because it is so long and compiler rounds it.

    }
}
