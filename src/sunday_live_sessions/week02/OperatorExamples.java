package sunday_live_sessions.week02;

public class OperatorExamples {
    public static void main(String[] args) {

        int age = 10;
        System.out.println(age); //10
        System.out.println(age++); //10
        // (above)it prints the value of age first then it'll be updated.
        System.out.println(age); //11


        /*
        num++
        think of it as
      ln1  num
      ln2  num +1
         */

                    //pro-
                                        //think of that way
        int x = 15;                     // x= 15
        int y = x++;                    // y = x
                                        // x +=1;
        System.out.println(x);            //16  
        System.out.println(y);             //15
        
                    //pre-
        int z = 90;          // think that way
        int w = --z;        // z -= 1; //89
                            // int w = z; //89
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        int a = 3 ;
        int b = 5;
        a++; //a +=1; so a = 4
        int c = a + b ;// 5+4
        System.out.println(c); //9




    }
}
