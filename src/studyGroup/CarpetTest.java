package studyGroup;

public class CarpetTest {

    public static void main(String[] args) {


        Carpet kilim = new Carpet(); // carpet #1 clone !! instances variables and methods

        /*kilim.length = 12;
        kilim.width= 20;
        kilim.unitPrice = 50;
        kilim.isPersian = true;*/

        System.out.println(kilim.length);   // double default 0.0
        System.out.println(kilim.isPersian); // boolean default false
        System.out.println(kilim.name); // String default : null

       kilim.setInfo("Ankara",12,20,50,false);


        System.out.println(kilim.length);
        System.out.println(kilim.name);

        System.out.println(kilim.calcCost());

        System.out.println(kilim); // We can call toString method with the name of the object.
        // obj reference = kilim.toString();

        System.out.println("*********");

        Carpet kilim2 = new Carpet();
        System.out.println(kilim2);

    }
}
