package daily_videos.day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

                //Assignment operator --> assign a value to a varible and reassign !!
        int a = 20;
        System.out.println(a); //20
        System.out.println(a); //20

        a = 40;  //the variable a is just updated !
        System.out.println(a); //40

        a=90;
        System.out.println(a); //90


        System.out.println("**************");

                //ADDITION ASSIGNMENT

        double balance = 100;
        balance += 1000;
        System.out.println(balance); // new value of the balanca is 1100.0 -eleven hundred

        balance += 500;
        System.out.println(balance); // 1100 + 500 = 1600

        System.out.println("****************");
                //SUBTRACTION ASSIGNMENT
        //actual-current value of balance is 1600!
        balance -=300;
        System.out.println(balance); // 1600 - 300 = 1300

        balance -= 1000;
        System.out.println("balance = " + balance);

        System.out.println("***************");
                //MULTIPLICATION ASSIGNMENT

        double salary = 45000;

        salary *= 2; // 45000 * 2 -- new salary value
        System.out.println("salary = " + salary);


        salary *=3 ; // actual salary: 90000 and it multiplies by 3  so new value 270_000
        System.out.println("salary = " + salary);

        System.out.println("*****************");

                // DIVISION ASSIGNMENT

        double eth =1000;
        eth /=2; // actual value is 1000 and it divides it in 2. so new value is 500/
        System.out.println("eth = " + eth);

        salary /= 3; // salary was before this operation 270000 and it divides in there and it's 90000.
        System.out.println("salary = " + salary);

        System.out.println("****************");

        int b = 39;
        b %= 7;
        System.out.println(b); // the result is 4. because when we divide 39 by 7; 4 is left(over).

        System.out.println(3000 %13);







    }

}


