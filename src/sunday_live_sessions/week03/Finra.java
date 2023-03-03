package sunday_live_sessions.week03;

public class Finra {

    public static void main(String[] args) {

        int number = 7;
        String result = "";
        if (number % 3 == 0 || number % 5 == 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                result = "FINRA";
            } else if (number%3 ==0){
                result= "FIN";
            }else{
                result ="RA";
            }
        }else{
            System.out.println(number);
        }
        System.out.println(result);

    }
}
