package ticTacToe;

import java.util.Scanner;

import static ticTacToe.CheckWin.winnerCheck;

public class App {
    public static char playerX = 'X';
    public static char playerZero = '0';
    public static char currentPlayer;
    public static boolean win;

    public static void main(String[] args) {
        PlayerControl playerControl = new PlayerControl();
        MatrixUtil square = new MatrixUtil();
        CheckWin checkWin = new CheckWin();

        char[][] myArray = new char[10][10];
        square.fillArray(myArray);
        square.printSquare(myArray);

        Scanner scanner = new Scanner(System.in);

        winnerCheck(playerControl, square, checkWin, myArray, scanner);
    }
}