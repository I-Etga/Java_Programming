package daily_videos.day08_ternary_switch;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Floor number: ");
        int floorNumber = scanner.nextInt();
        String display = "";
        // the first way -old way

        if(floorNumber>=1 && floorNumber<=3){
            display = "Floor " +floorNumber+ " is selected. Companies: ";
            if(floorNumber ==1) display += "Lobby,Verizon,Starbucks";
            else if (floorNumber ==2) display +="Cybertek , NASA,Intelsat";
            else display +="Lyft, BofA, Stake House";
        }else{
            display = "Invalid flood -6 ";
        }

        System.out.println(display);
        scanner.close();
    }
}


/*
       if(floorNumber>=1 && floorNumber<=3){

            if(floorNumber ==1) display = "Floor " +floorNumber +" selected. Companies: Lobby,Verizon,Starbucks";
            else if (floorNumber ==2) display = "Floor " +floorNumber+ " selected. Companies: Cybertek , NASA,Intelsat";
            else display ="Floor " + floorNumber+" selected. Companies: Lyft, BofA, Stake House";
        }else{
            display = "Invalid flood -6 ";
        }
 */
