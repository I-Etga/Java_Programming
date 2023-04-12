package wednesdays_office_hours.week10.encryption;

public class TestEncryption {
    public static void main(String[] args) {

        T2Encryption obj1 = new T2Encryption("james bond",20,2);

        obj1.encrypt();
        System.out.println(obj1.message);
        System.out.println(T2Encryption.decrypt("252 234 258 242 270 104 236 262 260 240",20,2));
    }
}
