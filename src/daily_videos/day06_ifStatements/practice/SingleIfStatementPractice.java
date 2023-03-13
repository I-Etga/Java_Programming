package daily_videos.day06_ifStatements.practice;

public class SingleIfStatementPractice {

    public static void main(String[] args) {
        int number = 99;
        boolean isEven = number % 2 ==0;


        if (isEven){
            System.out.println("even number");
        }
        if(!isEven){
            System.out.println("odd number");
        }


        System.out.println("******ALTERNATIVE*********");
            //this type of writing code is identical the codes we have written above
        if (number % 2 ==0){
            System.out.println("even number");
        }
        if(number % 2 != 0){
            System.out.println("odd number");
        }

    }
}
