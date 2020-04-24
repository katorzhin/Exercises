package ticTacToe;

import java.util.Scanner;

public class App {
    public static char playerX = 'X';
    public static char currentPlayer;
    public static boolean win;

    public static void printSquare(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(char[][] array) {
        currentPlayer = playerX;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }
    }

    public static void searchWinner(char[][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '-') {
                System.out.println("Player win");
                win = true;
            }
        }
    }

    public static void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'Y';
        } else {
            currentPlayer = 'X';
        }
    }

    public static void enterTurn(char[][] myArray, Scanner scanner) {
        System.out.println("TURN " + currentPlayer);
        System.out.println("Please, enter the first index:");
        int firstIndex = scanner.nextInt();
        System.out.println("Enter the second index:");
        int secondIndex = scanner.nextInt();
        myArray[firstIndex][secondIndex] = currentPlayer;
    }

    public static void checkRow(char[][] myArray) {
        for (int i = 0; i < 3; i++) {
            if (myArray[i][0] == myArray[i][1] && myArray[i][1] == myArray[i][2] && myArray[i][0] != '-') {
                System.out.println("Player " + currentPlayer + " win");
                win = true;
            }
        }
    }

    public static void main(String[] args) {
        char[][] myArray = new char[3][3];
        fillArray(myArray);
        Scanner scanner = new Scanner(System.in);

        while (!win) {
            enterTurn(myArray, scanner);
            printSquare(myArray);
            checkRow(myArray);
            changePlayer();
        }
    }
}