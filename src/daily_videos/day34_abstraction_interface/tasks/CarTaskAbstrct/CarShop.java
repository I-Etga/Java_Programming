package daily_videos.day34_abstraction_interface.tasks.CarTaskAbstrct;

public class CarShop {
    public static void main(String[] args) {


      /*
            # Interfaces are not Class. So they can't be instantiated !! no object
                Autopark autopark = new Autopark();
                AutoPilot autoPilot = new AutoPilot();
                Fylable fylable = new Fylable();
                                */

        Audi audi = new Audi();
        audi.autoPark();
        System.out.println(Audi.hasAutoPark); //variables in interface is static&final by default !!


        BMW bmw = new BMW();
        bmw.autoPark();
        System.out.println(BMW.hasAutoPark); //variables in interface is static&final by default !!


        //Car car = new Car();  -> Abstract class can not be instantiated [no object]!!

        CydeoCar cydeoCar = new CydeoCar();
        cydeoCar.fly();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        System.out.println(CydeoCar.canFly);//variables in interface is static&final by default !!
        System.out.println(CydeoCar.hasAutoPark);//variables in interface is static&final by default !!

        Honda honda = new Honda();
        honda.autoPark();
        System.out.println(Honda.hasAutoPark); //variables in interface is static&final by default !!

        Mercedes mercedes = new Mercedes();
        mercedes.autoPark();
        System.out.println(Mercedes.hasAutoPark);//variables in interface is static&final by default !!

        Nio nio = new Nio();
        nio.autoPark();
        nio.selfDrive();
        System.out.println(Nio.hasAutoPark); //variables in interface is static&final by default !!

        Tesla tesla = new Tesla();
        tesla.autoPark();
        tesla.selfDrive();
        System.out.println(Tesla.hasAutoPark);//variables in interface is static&final by default !!

        Toyota toyota = new Toyota();
        toyota.autoPark();
        System.out.println(Toyota.hasAutoPark);
    }
}
