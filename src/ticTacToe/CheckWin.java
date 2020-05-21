package ticTacToe;

import java.util.Scanner;

import static ticTacToe.App.*;

public class CheckWin {
    public static void winnerCheck(PlayerControl playerControl, MatrixUtil square,
                                   CheckWin checkWin, char[][] myArray, Scanner scanner) {
        while (!win) {
            enterTurn(myArray, scanner);
            square.printSquare(myArray);
            boolean checkRows = checkWin.hasNSymbolsInARow(myArray, 5, '-');
            boolean checkColumns = checkWin.hasNSymbolsInAColumn(myArray, 5, '-');
            boolean checkDiagonals = checkWin.checkDiagonal(myArray, 5, '-');
            if (checkRows || checkColumns || checkDiagonals) {
                win = true;
                System.out.println("Player " + currentPlayer + " win!");
            }
            playerControl.changePlayer();
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

    public boolean hasNSymbolsInAColumn(char[][] array, int quantity, char a) {
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

    public boolean checkDiagonal(char[][] array, int quantity, char a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j][j] == array[j + 1][j + 1]) {

                }
            }
        }
        return false;
    }
}