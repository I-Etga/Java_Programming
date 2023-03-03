package sunday_live_sessions.week02;

public class Week02 {
    public static void main(String[] args) {


            // at least one String =concatenation (totally different from addition in Math)
                // String + any data type(even boolean is ok)
        System.out.println(5 + 3 + "hello"); // 53hello // output data type = String
        System.out.println("JAVA" +1 + 2); // JAVA12 //output data type = String
        System.out.println("java" + true); // javatrue //output data type = String
                            // parentheses make difference.!!!
        System.out.println("java" + (1+2)); // java3 output //data type = String

                // int + int == addition (like in math)
        System.out.println(5 + 3); // 8 output data type = int

                // char + char == addition (like in Math 3+5=8)
                        // char variable is a bit weird.
                        // if we print that alone , the char will be printed.
                        // but we use addition operator, compiler use their ascii number and add one another.
        System.out.println('A');  //A output data type = char
        System.out.println('B'); //B    output data type = char
        System.out.println((int)'A'); //65  output data type = int
        System.out.println((int)'B'); //66  output data type = int
        System.out.println('A'+'B'); //131  output data type = int


        System.out.println("************");

        int age = 30;
        String month = "March";
        String str = "In " + month + " you will turn " + age;
        System.out.println(str);



                //how to find out, which data type a variable has/
            // System.out.println(((Object)x).getClass().getName());

        System.out.println(((Object)('A')).getClass().getName()); //char
        System.out.println(((Object)((int)'A')).getClass().getName()); //int
        System.out.println(((Object)('A'+ 'B')).getClass().getName());  //int
        System.out.println(((Object)("java" + (1+2))).getClass().getName());  //String

    char E = 'E';
    char t = 't';
    char g = 'g';
    char a = 'a';

        System.out.println(E+t+g+a); // char + char = addition so we get a integer
            //output: 353 (addition of the unique value of this four characters.)

        // If I want to print my name, I should write that code:
                // at least one string. Then that would be concatenation
        System.out.println(E +""+t+""+g+""+a); //output: Etga
        System.out.print(E);
        System.out.print(t);
        System.out.print(g);
        System.out.print(a);


    }
}
