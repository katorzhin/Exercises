package ticTacToe;

import static ticTacToe.App.playerX;
import static ticTacToe.App.currentPlayer;

public class FillingSquare {
    public void printSquare(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillArray(char[][] array) {
        currentPlayer = playerX;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }
    }
}
