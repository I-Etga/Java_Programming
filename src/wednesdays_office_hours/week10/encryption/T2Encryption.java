package wednesdays_office_hours.week10.encryption;

public class T2Encryption {

    public String message;
    public int modifyNumber;
    public int factorNumber;

    public T2Encryption(String message) {
        this.message = message;
    }

    public T2Encryption(String message, int modifyNumber, int factorNumber) {
        this(message);
        this.modifyNumber = modifyNumber;
        this.factorNumber = factorNumber;
        encrypt();

    }

    public String encrypt() {
        char[] code = message.toCharArray();
        String encrypt = "";
        for (char c : code) {
            encrypt += (modifyNumber + c) * factorNumber + " ";
        }

        return encrypt;
    }

    public static String decrypt(String message, int modifyNumber, int factorNumber) {

        String[] decrypt = message.split(" ");

        String messageDecrypt = "";

        for (String each : decrypt) {
            int x = Integer.parseInt(each);
            x /= factorNumber;
            x -= modifyNumber;
            char y = (char) x;
            messageDecrypt += "" + y; // #2 short version (char)(Integer.parseInt(each) / factorNumber - modifyNumber

        }
        return messageDecrypt;
    }
    public String toString() {
        return "T2Encryption{" +
                "message='" + message + '\'' +
                '}';
    }
}