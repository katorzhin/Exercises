package ticTacToe;

import static ticTacToe.App.currentPlayer;
import static ticTacToe.App.win;

public class CheckWin {
    public void checkRow(char[][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '-') {
                System.out.println("Player " + currentPlayer + " win");
                win = true;
            }
        }
    }

    public boolean hasNSymbolsInARow(char[][] array, int quantity, char a) {
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

    public static boolean hasNSymbolsInAColumn(char[][] array, int quantity, char a) {
        int count = 1;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j][i] == array[j + 1][i] && array[j][i] != a) {
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

    public static boolean checkDiagonalForCenter(char[][] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i][i] == array[i + 1][i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonal(char[][] array) {
        for (int i = 0; i < array.length * 2 - 1; i++) {
            if (i < array.length - 1) {
                System.out.println(i);
            } else {
                System.out.println(array.length - 2 - i);
            }

        }
        for (int i = 0; i < array.length * 2 - 1; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        return false;
    }

}
