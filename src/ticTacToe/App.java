package ticTacToe;

import java.util.Scanner;

public class App {
    public static char playerX = 'X';
    public static char currentPlayer;
    public static boolean win;

    public static void searchWinner(char[][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '-') {
                System.out.println("Player win");
                win = true;
            }
        }
    }

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

    public static void checkDiagonally(char[][] array) {
        if (array[1][1] != '-') {
            if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[0][0] != '-') {
                System.out.println("Player " + currentPlayer + " win");
                win = true;
            }
            if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[0][2] != '-') {
                System.out.println("Player " + currentPlayer + " win");
                win = true;
            }
        }
    }


    public static void main(String[] args) {
        PlayerControl playerControl = new PlayerControl();
        FillingSquare square = new FillingSquare();
        ControlRows controlRows = new ControlRows();
        ControlColumns controlColumns = new ControlColumns();

        char[][] myArray = new char[3][3];
        square.fillArray(myArray);
        square.printSquare(myArray);

        Scanner scanner = new Scanner(System.in);

        while (!win) {
            enterTurn(myArray, scanner);
            square.printSquare(myArray);
            controlRows.checkRow(myArray);
            checkDiagonally(myArray);
            playerControl.changePlayer();
        }
    }
}