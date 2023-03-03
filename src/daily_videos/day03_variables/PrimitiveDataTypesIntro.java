package daily_videos.day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
        //DataType variableName = Data;

        // byte a = "Java";// byte ONLY accepts integer values (-128 to 127)

        //byte a = 20.5; ( byte doesn't accept decimal number !')
        //byte a = 20000; (the range of byte is -128 to 127 !) out of Byte'range
        byte a = 20;

        // the price of the car is $17.500
        short b = 17500;

        System.out.println("p");
        System.out.println(b);

        // salary is $95000 // the range of the short is -32k to 32k
                            // so we use integer or long !

        int s = 95000; // preferred
        System.out.println(s);

        //int d = 999999999;
        long d = 9999999999999L;  // we need to add lowercase or uppercase L at the end

        // gpa is 3.5

        double gpa = 3.5; // preferred data time of the decimal numbers

        float gpa2 = 3.5f; // we need to add lowercase or uppercase F at the end.




    }
}
