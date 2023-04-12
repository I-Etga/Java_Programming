package wednesdays_office_hours.week10.encryption;

public class TestEncryption {
    public static void main(String[] args) {

        T2Encryption obj1 = new T2Encryption("james bond", 20, 2);

        obj1.encrypt();
        System.out.println(obj1.encrypt());
        System.out.println(T2Encryption.decrypt("252 234 258 242 270 104 236 262 260 240", 20, 2));

        System.out.println("*****");
        T2Encryption first = new T2Encryption("james bond"); // because of one parameter constructor I created an object with name !
        // other instances I can assign one by one !
        first.modifyNumber = 20;
        first.factorNumber = 2;
        first.encrypt();
        System.out.println(first);

        T2Encryption secret = new T2Encryption("I make cookies with more sugar", 35, 3);
        System.out.println(secret);

        String secretMsg = "324 201 432 396 426 408 201 402 438 438 426 420 408 450 201 462 420 453 417 201 432 438 447 408 201 450 456 414 396 447";

        // I am giving the wrong factor and modify numbers
        System.out.println(T2Encryption.decrypt(secretMsg, 20, 2)); // If I don;t pass the correct modify and factor , I can't decrypt the message.

        // I am giving the valid factor and modify numbers
        System.out.println(T2Encryption.decrypt(secretMsg, 35, 3));

    }
}

