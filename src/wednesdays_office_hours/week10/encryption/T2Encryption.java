package wednesdays_office_hours.week10.encryption;

public class T2Encryption {

    public String message;
    public int modifyNumber;
    public int factorNumber;


    public T2Encryption(String message) {
        this.message = message;
        // modifynumber = 0 (default)
        // factorNumber = 0 (default)
    }

    public T2Encryption(String message, int modifyNumber, int factorNumber) {
        this(message);
        this.modifyNumber = modifyNumber;
        this.factorNumber = factorNumber;
        encrypt();

    }

    public  void encrypt() {

        char[] code = message.toCharArray(); // ['j','a', ...]

        String encrypt = "";
        for (char ch : code) {
            encrypt += (modifyNumber + ch) * factorNumber + " "; // 50+'0' = 50+48 -> 98 *3 294
        }
        System.out.println(encrypt);
    }
  /*  public  String encryptReturn() {
        char[] code = message.toCharArray();
        String encrypt = "";
        for (char c : code) {
            encrypt += (modifyNumber + c) * factorNumber + " ";
        }
        return encryptReturn();
    }*/

    public static String decrypt(String messageSt, int modifyNumberSt, int factorNumberSt) { // parameters are local variables, not instances. Don't be confused.

        String[] decrypt = messageSt.split(" ");

        String messageDecrypt = "";

        for (String each : decrypt) {  //"294"
            int x = Integer.parseInt(each); //"294" -> 294
            x /= factorNumberSt;
            x -= modifyNumberSt; // x -> ascii number of char
            char y = (char) x; // get char from its ascii  'j'
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