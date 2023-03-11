package daily_videos.day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        /*      this for loop prints infinite times Hello World.
                        Because the condition will be never false !!
              (int i 5; i<=10 , i--) -->[ i = 5,4,3,2,1,-1,0 .... so always <= 10]
        for (int i=5; i<=10; i--){
            System.out.println("Hello World");
        }
         */

        for (int i=10; i>=5; i--){
            System.out.println("Hello World " + i);
        }


                // count 1-100
        for (int number = 1; number <=100;number++){
            System.out.println(number);
        }
    }
}
