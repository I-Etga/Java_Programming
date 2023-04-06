package wednesdays_office_hours.week9;

import java.util.Arrays;

public class T1TicTacToe {
    public static void main(String[] args) {

        char[][] board = {
                {'-', 'O', 'X'},
                {'-', 'O', 'X'},
                {'X', 'O', '-'},
        };

        String winner = "";

        for (int i = 0; i < board.length; i++) {
            //check row
            String row = Arrays.toString(board[i]).replace(", ", "").replace("[", "").replace("]", "");
            //check colm
            String colm = "" + board[0][i] + board[1][i] + board[2][i];

            if (row.equals("XXX") || colm.equals("XXX")) {
                winner = "X";
            } else if (row.equals("OOO") || colm.equals("OOO")) {
                winner = "O";
            }
        }
        // check  diagonal
        String dig1 = "" + board[0][0] + board[1][1] + board[2][2];
        String dig2 = "" + board[2][0] + board[1][1] + board[0][2];

        if (dig1.equals("XXX") || dig2.equals("XXX")) {
            winner = "X";
        } else if (dig1.equals("OOO") || dig2.equals("OOO")) {
            winner = "O";
        }

        if (winner.isEmpty()) {
            System.out.println("Tie");
        } else {
            System.out.println(winner + " player wins");
        }
    }
}

