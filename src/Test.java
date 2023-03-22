public class Test {

    public static void main(String[] args) {
        int number = 0;

        for (char j = 'A'; j < 'H'; j++) {

            char ch = j; // A0 A1 A2 A3

            for (int i = 0; i < 7; i++) {
                if (i == 4) {
                    return;
                }
                System.out.println(ch + ""+ i); //AO A1 A2 A3 B0 B1 B2 B3
            }
            System.out.println("Ankaras"); // codes after return wont get executed.
        }


    }
}
