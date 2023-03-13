package daily_videos.day14_forLoop.practice;

public class Finra {
    public static void main(String[] args) {

        divededEqualsfiveAndOrThree();

    }

    public static void divededEqualsfiveAndOrThree(){
        String result ="";
        for(int i =1; i <=100; i++){
            if(i%15==0){
                result += "FINRA ";
            } else if (i%3 ==0) {
                result += "FIN ";
            }else if (i%5 ==0){
                result += "RA ";
            }else{
                result +=  i + " ";
            }

        }
        System.out.print(result );

        /*
        The position of the print statement is really important.
              if you write the print statement inside for loop(for ex. line22):
                        You MUST be careful.

             In the case that print is inside for loop : [print as much as loops runs]
                    if(i%15==0){
                result = "FINRA ": ...                                      =
                                                      # Difference is
             In the case that print is outside for loop :[print only once]
                    if(i%15==0){
                result += "FINRA ";...                                      +=

         */
    }
}
