package wednesdays_office_hours.week9;

public class T1TicTacToe {
    public static void main(String[] args) {

        String[][] ticTacToe = {{"X", "0", "X"}, {"X", "0", "X"}, {"0", "X", "0"}};

        for (int i = 0; i < ticTacToe.length; i++) {
            String[] strings = ticTacToe[i];
            int countX = 0;
            int count0 = 0;

            for (String string : strings) {
                if (string.equals("X")) {
                    countX++;
                }
                if (string.equals("0")) {
                    count0++;
                }
            }
            if (countX == 3) {
                System.out.println("X is won");
                return;
            }
            if (count0 == 3) {
                System.out.println("X is won");
                return;
            }


            if (i == 2) {
                System.out.println("Tie");
            }
        }
    }
}
