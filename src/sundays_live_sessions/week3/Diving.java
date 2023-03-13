package sundays_live_sessions.week3;

public class Diving {
    /*
    Diving [multibranch]

	Declare and assign a oxygen tank level. This level will be a whole number percentage, so 80 would represent 80% oxygen

	Check how much oxygen is left in the tank and output a corresponding message

		use these ranges:
			100 - 90: Your tank is full
			89 - 80: A lot left to use
			79 - 70: Don't go too far
			69 - 60: Start to head back
			59 - 50: Be careful now you at at 50%
			Less than 50: Critical
     */
    public static void main(String[] args) {

//        int oxygen = 100;

//        if(oxygen >= 90){ // dont need the full range when you create the multibranch in order
//            System.out.println("Your tank is full");
//        } else if(oxygen >= 80){
//            System.out.println("A lot left to use");
//        } else if(oxygen >= 70){
//            System.out.println("Don't go too far");
//        } else if(oxygen >= 60){
//            System.out.println("Start to head back");
//        } else if(oxygen >= 50){
//            System.out.println("Be careful now you at 50%");
//        } else {
//            System.out.println("Critical");
//        }


        // --- alternative with String variable and different way to define the if condition

        int oxygen = 100;
        String msg = "";

        if(oxygen >= 90  && oxygen <= 100){
            msg = "Your tank is full";
        } else if(oxygen >= 80  && oxygen <= 89){
            msg ="A lot left to use";
        } else if(oxygen >= 70  && oxygen <= 79){
            msg = "Don't go too far";
        } else if(oxygen >= 60  && oxygen <= 69){
            msg = "Start to head back";
        } else if(oxygen >= 50  && oxygen <= 59){
            msg = "Be careful now you at 50%";
        } else {
            msg = "Critical";
        }

        System.out.println(msg);
    }
}
