package daily_videos.day34_abstraction_interface.tasks.deviceTask;


public class DeviceShop {

    // abstract classes and interfaces can NOT be instantiated, which means NO OBJECT can be created from them !!
    // Abstract classes: Device,Phone,Computer & Interfaces: Downloadable,AndroidApps,AppleApps.

    public static void main(String[] args) {

        // AppStoreName and OS variables are inherited from interface named AndroidApps. Since it's interface, variables are static and final by default. So we can use it through class name.
        System.out.println(Samsung.AppStoreName);
        System.out.println(Samsung.OS);
        Samsung samsung = new Samsung("S23", "Purple", "Large", 1250, true, true);
        samsung.turnOn();
        samsung.turnOff();
        samsung.downloadApp();
        samsung.call(324657);

        // AppStoreName and OS variables are inherited from interface named AndroidApps. Since it's interface, variables are static and final by default. So we can use it through class name.
        System.out.println(Google.AppStoreName);
        System.out.println(Google.OS);
        Google google = new Google("Pixel ProX", "White", "Large", 900, true, true);
        google.turnOn();
        google.turnOff();
        google.downloadApp();
        google.call(78653647);

        // AppStoreName and OS variables are inherited from interface named AppleApps. Since it's interface, variables are static and final by default. So we can use it through class name.
        System.out.println(IPhone.AppStoreName);
        System.out.println(IPhone.OS);
        IPhone iPhone = new IPhone("12", "Green", "Large", 850, true, true);
        iPhone.turnOn();
        iPhone.turnOff();
        iPhone.downloadApp();
        iPhone.call(3245612);
        iPhone.faceTime(324567);


        Dekstop desktop = new Dekstop("MSI", "XR", "Gray", "Large", 1400, false, true);
        desktop.turnOn();
        desktop.turnOff();
        desktop.downloadApp();


        Laptop laptop = new Laptop("Asus", "TT78", "Black", "15.6", 1000, true, true);
        laptop.turnOn();
        laptop.turnOff();
        laptop.downloadApp();

        PersonalComputer PC = new PersonalComputer("Apple", "iMac Studio", "Space Gray", "M", 1400, false, true);
        PC.turnOn();
        PC.turnOff();
        PC.downloadApp();

    }

}