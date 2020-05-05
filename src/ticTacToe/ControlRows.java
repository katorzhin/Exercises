package ticTacToe;

import static ticTacToe.App.currentPlayer;
import static ticTacToe.App.win;

public class ControlRows {
    public void checkRow(char[][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '-') {
                System.out.println("Player " + currentPlayer + " win");
                win = true;
            }
        }
    }
    public  boolean hasNSymbolsInARow(char[][] array, int quantity, char a) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] == array[i][j + 1] && array[i][j] != a) {
                    count++;

                    if (count == quantity) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
            count = 1;
        }
        return false;
    }
}
