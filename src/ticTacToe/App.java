package ticTacToe;

import java.util.Scanner;

import static ticTacToe.CheckWin.checkDiagonal;
import static ticTacToe.CheckWin.checkDiagonalForCenter;

public class App {
    public static char playerX = 'X';
    public static char currentPlayer;
    public static boolean win;

    public static void enterTurn(char[][] myArray, Scanner scanner) {
        System.out.println("TURN " + currentPlayer);
        while (true) {
            String input = scanner.nextLine();
            String[] coordinates = input.split(" ");
            int secondIndex = Integer.parseInt(coordinates[1]);
            int firstIndex = Integer.parseInt(coordinates[0]);
            boolean badFirstInput = firstIndex >= myArray.length || firstIndex < 0;
            boolean badSecondInput = secondIndex >= myArray.length || secondIndex < 0;
            if (badFirstInput || badSecondInput || (myArray[firstIndex][secondIndex] == 'X' || myArray[firstIndex][secondIndex] == 'Y')) {
                System.out.println("please correct index ");
            } else {
                myArray[firstIndex][secondIndex] = currentPlayer;
                break;
            }
        }
    }

    public static void main(String[] args) {
        PlayerControl playerControl = new PlayerControl();
        MatrixUtil square = new MatrixUtil();
        CheckWin controlRows = new CheckWin();

        char[][] myArray = new char[10][10];
        square.fillArray(myArray);
        square.printSquare(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println(myArray.length);
        while (!win) {
            enterTurn(myArray, scanner);
            square.printSquare(myArray);
            controlRows.checkRow(myArray);
            checkDiagonalForCenter(myArray);
            checkDiagonal(myArray);
            playerControl.changePlayer();

        }
    }
}