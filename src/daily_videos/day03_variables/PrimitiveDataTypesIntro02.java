package daily_videos.day03_variables;

public class PrimitiveDataTypesIntro02 {
    public static void main(String[] args) {

        // Syntax I always need
            // DataType variableName = Data;
                // it could ne digit / letter / special character

        char a = '1';
        char c = '!';
        char v = 'g';
        char at = '@';
        //char ab = 'ab'; // char ONLY accepts single character
        System.out.println(a);

        System.out.println("--------------------");
        char ch1 = 'A';
        char ch2 = 88; // You can use the number of the character !!
        char ch3 = 97;
        // It can not be less than 0.
        //char ch4 = -2; // we get error message

        System.out.println('A');
        System.out.println(ch2); //output X
        System.out.println(ch3); // output a

        System.out.println("---------------------");
        int sum = 'A' + 'B';
            // 65 + 66 = 131
        int A = 'A';
        int B = 'B';
        System.out.println(A); // output = 65
        System.out.println(B); //output = 66
        System.out.println(sum); // output = 131


        System.out.println("-----------");
        /*
        boolean r1 = 123;
        boolean r2 = 2.5;
        boolean r3 = "Java";
         */
        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1 ; // false

        System.out.println(r6);
        System.out.println(r7);




    }
}
