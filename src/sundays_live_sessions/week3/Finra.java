package sundays_live_sessions.week3;

public class Finra {
    /*
    {IQ} Finra [multibranch, operators]

	Create a program that will print the given number. But if the number is a multiple of 3 print "FIN" instead of the number. If the number is a multiple of 5 print "RA" instead of the number. And if the number is a multiple of 3 and 5 print "FINRA" instead of the number

		ex:
			number: 3
			output: FIN

			number: 10
			output: RA

			number: 15
			output: FINRA

			number: 7
			output: 7

	Hint: you will be checking for divisibility so you will need to use the % operator

     */
    public static void main(String[] args) {

        int num = 7;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        if(by3 && by5) { // num % 15 == 0
            System.out.println("FINRA");
        } else if(by3){
            System.out.println("FIN");
        } else if(by5){
            System.out.println("RA");
        } else {
            System.out.println(num);
        }

        System.out.println( by3 && by5 ? "FINRA" : by3 ? "FIN" : by5 ? "RA" : num);

        // come back 12;11 est
    }
}
