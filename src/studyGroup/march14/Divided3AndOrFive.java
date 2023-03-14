package studyGroup.march14;

public class Divided3AndOrFive {
    public static void main(String[] args) {

    String result = finra(15);

        System.out.println(result);
        System.out.println(finra(15));
        System.out.print("*****");
        finra(50);

    }

    public static String finra(int lastNumber){
        String result ="";
        for (int i = 1; i <= lastNumber; i++) {

            if((i%15==0)){
                result += " FINRA ";
            } else if (i%3==0) {
                result += " FIN ";
            } else if (i%5==0) {
                result += " RA ";
            }else{
                result += i +" " ;
            }
            //System.out.println("i: " + i + " result: " + result);
        }
        return result;
    }

}
