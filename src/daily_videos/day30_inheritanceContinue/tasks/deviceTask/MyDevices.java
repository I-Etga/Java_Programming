package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class MyDevices {
    public static void main(String[] args) {

        //          # Grandparent Class Device

        Device device = new Device("LG", "55AJFSAS", "Black", 55, 550, false, true); // Grandparent Class
        device.turnOn();
        device.turnOff();
        device.setHasBattery(false);
        System.out.println(device.getBrand());

        //              #1 Parent Class Phone

        Phone phone = new Phone("Samsung", "S23 Ultra", "Green", 7, 1700, true, true); // Parent class of Device Class
        phone.turnOn(); // inherited from Grandparent Class Device
        phone.turnOff(); // inherited from Grandparent Class Device
        phone.call();
        phone.text();
        phone.setColor("White");
        System.out.println(phone.getPrice());

        //               Child Classes of Phone Class && Grandparent Classes of Device Class

        Blackberry blackberry = new Blackberry("a56", "White", 5, 600, true, true);
        blackberry.turnOn(); // inherited from Grandparent Class Device
        blackberry.turnOff(); // inherited from Grandparent Class Device
        blackberry.call(); // inherited from Parent Class Phone
        blackberry.text();// inherited from Parent Class Phone [overridden]
        blackberry.setModel("B56");
        System.out.println(blackberry.getModel());


        Google google = new Google("Pixel55", "White", 6.8, 750, true, true);
        google.turnOn(); // inherited from Grandparent Class Device
        google.turnOff(); // inherited from Grandparent Class Device
        google.call();// inherited from Parent Class Phone
        google.text();// inherited from Parent Class Phone
        google.moonPhoto();// unique method
        google.setSize(8);
        System.out.println(google.getSize());

        IPhone iPhone = new IPhone("12 Pro Max", "White", 6.68, 1100, true, true);
        iPhone.turnOn(); // inherited from Grandparent Class Device
        iPhone.turnOff();  // inherited from Grandparent Class Device
        iPhone.call();// inherited from Parent Class Phone
        iPhone.text();// inherited from Parent Class Phone
        iPhone.faceTime(987542345); // unique method
        iPhone.faceTime("ia@icloud.com");// unique method
        iPhone.setColor("Green");
        iPhone.setPrice(1250);
        System.out.println(iPhone.getColor());

        Nokia nokia = new Nokia("3310", "Blue", 3, 100, true, true);
        nokia.turnOn(); // inherited from Grandparent Class Device
        nokia.turnOff(); // inherited from Grandparent Class Device
        nokia.call();// inherited from Parent Class Phone
        nokia.text();// inherited from Parent Class Phone
        nokia.defence();// unique method
        nokia.setModel("1100");
        nokia.setHasPowerButton(true);
        System.out.println(nokia.getColor());

        Samsung samsung = new Samsung("A53 5G", "Blue", 6.9, 399, true, true);
        samsung.turnOn(); // inherited from Grandparent Class Device
        samsung.turnOff(); // inherited from Grandparent Class Device
        samsung.call();// inherited from Parent Class Phone
        samsung.text();// inherited from Parent Class Phone
        samsung.zoom();// unique method
        samsung.setPrice(499);
        System.out.println(samsung.getModel());

        //              #2 Parent Class Computer

        Computer computer = new Computer("Apple", "Macbook Air", "Space Gray", 13.3, 900, true, true);
        computer.turnOn(); // inherited from Grandparent Class Device
        computer.turnOff(); // inherited from Grandparent Class Device
        computer.restart();
        computer.setColor("Gray");
        System.out.println(computer.getBrand());

        //               Child Classes of Computer Class && Grandchild Classes of Device Class

        Desktop desktop = new Desktop("Apple", "iMac", "Gray", 24, 1700, false, true);
        desktop.turnOn(); // inherited from Grandparent Class Device
        desktop.turnOff(); // inherited from Grandparent Class Device
        desktop.restart();// inherited from Parent Class Computer
        desktop.setSize(27);
        System.out.println(desktop.getColor());

        Laptop laptop = new Laptop("Lenovo", "EN2023", "Black", 15.6, 900, true, true);
        laptop.turnOn(); // inherited from Grandparent Class Device
        laptop.turnOff(); // inherited from Grandparent Class Device
        laptop.restart(); // inherited from Parent Class Computer
        laptop.onTrip(); // unique method
        laptop.setHasBattery(false);
        System.out.println(laptop.getModel());

        PersonalCumputer personalCumputer = new PersonalCumputer("Asus", "XR242", "Red", 27, 1600, false, true);
        personalCumputer.turnOn(); // inherited from Grandparent Class Device
        personalCumputer.turnOff(); // inherited from Grandparent Class Device
        personalCumputer.restart(); // inherited from Parent Class Computer
        personalCumputer.pc();// unique method
        personalCumputer.setHasPowerButton(true);
        System.out.println(personalCumputer.getSize());

        //              #3 Parent Class TV

        TV tv = new TV("Samsung", "UHD58GDASK", "Black", 58, 800, false, false);
        tv.turnOn(); // inherited from Grandparent Class Device
        tv.turnOff(); // inherited from Grandparent Class Device
        tv.channelUp();// unique method
        tv.channelDown(); // unique method
        tv.setPrice(499);
        System.out.println(tv.getBrand());

        //               Child Classes of TV Class && Grandchild Classes of Device Class

        SmartTv smartTv = new SmartTv("Grundig", "GD65ASFASF", "Black", 65, 600, false, false);
        smartTv.turnOn(); // inherited from Grandparent Class Device
        smartTv.turnOff(); // inherited from Grandparent Class Device
        smartTv.channelUp(); // inherited from Parent Class TV
        smartTv.channelDown();// inherited from Parent Class TV
        smartTv.stream(); // unique method
        smartTv.setColor("White");
        System.out.println(smartTv.getColor());


    }
}
