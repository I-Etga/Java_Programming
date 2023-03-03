package daily_videos.day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // pre increment / decrement

        int x = 10;
        System.out.println(++x); //11
        System.out.println(x); //11
                                        // increment operator comes before the variable.
                                    // That means the values is incremented in the memory IMMEDIATELY

        int y = 100;
        System.out.println(--y); //99
        System.out.println(y); //99
                                    //Same principle - value is decremented IMMEDIATELY


                //POST Increment/Decrement

                                //VALUE IS EVENTUALLY INCREASED/DECREASED BUT NOT IMMEDIATELY

        int a = 50;
        System.out.println(a++); //50
        System.out.println(a); //51

        int b = 100;
        System.out.println(b--); //100
        System.out.println(b); //99

        System.out.println("***********");

        int n = 30;
        int m = ++n; // n is increased immediately so n and m =31
        System.out.println(n);
        System.out.println(m);

        int k = 50;
        int l = k++; // k is NOT increased immediately BUT EVENTUALLY. SO k=51 , l = 50 /

        System.out.println(k);
        System.out.println(l);


        int z = 60;
        int q = z--; // NOT IMMEDIATELY BUT EVENTUALLY. SO z= 59 , q = 60

        System.out.println(z);
        System.out.println(q);


    }
}
