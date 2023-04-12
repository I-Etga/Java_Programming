package wednesdays_office_hours.week10.encryption;

import daily_videos.day03_variables.Char;

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

    }

    public void encrypt() {
        char[] code = message.toCharArray();
        message = "";
        for (char c : code) {
            message += (modifyNumber + c) * factorNumber + " ";
        }

        System.out.println(message);
    }

    public static String decrypt(String message, int modifyNumber, int factorNumber) {

        String[] decrypt = message.split(" ");

        String messageDecrypt = "";

        for (String s : decrypt) {
            int x = Integer.parseInt(s);
            x /= factorNumber;
            x -= modifyNumber;
            char y = (char) x;
            messageDecrypt += "" + y;

        }
        return messageDecrypt;
    }
    public String toString() {
        return "T2Encryption{" +
                "message='" + message + '\'' +
                ", modifyNumber=" + modifyNumber +
                ", factorNumber=" + factorNumber +
                '}';
    }
}