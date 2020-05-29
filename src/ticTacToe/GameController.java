package ticTacToe;

import java.util.Scanner;

import static ticTacToe.App.*;
import static ticTacToe.App.PLAYER_X;
import static ticTacToe.CheckWin.*;
import static ticTacToe.Input.enterTurn;

public class GameController {

    public static void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = PLAYER_ZERO;
        } else {
            currentPlayer = PLAYER_X;
        }
    }
    public void startGame(MatrixUtil square, char[][] myArray, Scanner scanner) {
        while (!win) {
            enterTurn(myArray, scanner);
            square.printSquare(myArray);
            boolean checkRows = hasNSymbolsInARow(myArray, 5, '-');
            boolean checkColumns = hasNSymbolsInAColumn(myArray, 5, '-');
            boolean checkDiagonals = checkDiagonal(myArray, 5, '-');
            if (checkRows || checkColumns || checkDiagonals) {
                win = true;
                System.out.println("Player " + currentPlayer + " win!");
            }
            changePlayer();
        }
    }
}
