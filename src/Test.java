public class Test {

    public static void main(String[] args) {
        int number = 0;

        for (char j = 'A'; j < 'H'; j++) {
            int k = 0;
            char ch = j;
            for (int i = 0; i < 6; i++) {
                if (i == 4) {
                    return;
                }
                System.out.println(ch + ""+ i);
            }
            System.out.println("Ankaras"); // codes after return wont get executed.
        }
    }
    }
