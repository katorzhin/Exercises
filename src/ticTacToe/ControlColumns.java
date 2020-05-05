package ticTacToe;

public class ControlColumns {
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
}
