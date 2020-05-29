package ticTacToe;

import java.util.Scanner;


public class App {
    public static final char PLAYER_X = 'X';
    public static final char PLAYER_ZERO = '0';
    public static char currentPlayer;
    public static boolean win;

    public static void main(String[] args) {
        GameController gameController = new GameController();
        MatrixUtil square = new MatrixUtil();
        CheckWin checkWin = new CheckWin();

        char[][] myArray = new char[10][10];
        square.fillArray(myArray);
        square.printSquare(myArray);

        Scanner scanner = new Scanner(System.in);

        gameController.startGame(square,myArray,scanner);
    }
}