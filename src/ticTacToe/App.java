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

    public static void checkRow(char[][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != '-') {
                System.out.println("Player " + currentPlayer + " win");
                win = true;
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

    public static void main(String[] args) {
        char[][] myArray = new char[3][3];
        fillArray(myArray);
        printSquare(myArray);
        Scanner scanner = new Scanner(System.in);

        while (!win) {
            enterTurn(myArray, scanner);
            printSquare(myArray);
            checkRow(myArray);
            checkDiagonally(myArray);
            changePlayer();
        }
    }
}