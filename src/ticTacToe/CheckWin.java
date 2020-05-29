package ticTacToe;

public class CheckWin {

    public static boolean hasNSymbolsInARow(char[][] array, int quantity, char a) {
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

    public static boolean checkDiagonal(char[][] array, int quantity, char a) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j][j] == array[j][i + 1]) {
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