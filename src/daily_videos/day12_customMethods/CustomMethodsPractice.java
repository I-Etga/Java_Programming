package daily_videos.day12_customMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        String first = "CyDeo";
        String last = "SchOol";

        formatFullName(first,last);
        formatFullName("David","Back");


        System.out.println("***********");


        double num1 = 45;
        double num2 = -87;

        /*
        how to navigate to the body of method
                -click command/ctrl
                -methods name will be clickable
                -Once we click the name of method, we will be navigated to the body of the method.

            REMINDER- rename only using refactor !!
         */
        initial(num1,num2);
        initial(43,54);
        initial(123,-55);

    }

    public static void formatFullName(String firstName,String lastName){
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " +lastName;
        System.out.println(fullName);
    }

    public static void initial(double number1, double number2){
        String message = "";
        if(number1>number2){
            message = number1+ " is the maxium number";
        }else if(number2 >number1){

            message = number2+ " is the maxium number";
        }else{
            message = "equal";
        }
        System.out.println(message);
    }
}
