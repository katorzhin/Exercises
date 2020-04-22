package ticTacToe;

import java.util.Scanner;

public class App {
    public static char playerX = 'X';
    public static char playerY = 'Y';
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }
    }

    //public static void nextTurn(Scanner scanner,)
    public static void searchWinner(char[][] array) {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                System.out.println("Player win");
                win = true;
            }
        }
    }

    public static void main(String[] args) {
        char[][] myArray = new char[3][3];
        fillArray(myArray);
        Scanner scanner = new Scanner(System.in);
        currentPlayer = playerX;

        while (!win) {
            System.out.println("Next TURN " + currentPlayer);
            System.out.println("введи первый индекс");
            int firstIndex = scanner.nextInt();
            System.out.println("введи 2 индекс");
            int secondIndex = scanner.nextInt();
            myArray[firstIndex][secondIndex] = currentPlayer;
            printSquare(myArray);
            for (int i = 0; i < 3; i++) {

                if (myArray[i][0] == myArray[i][1] && myArray[i][1] == myArray[i][2] && myArray[i][0] != '-') {
                    System.out.println("Player " + currentPlayer + " win");
                    win = true;
                }
            }
            if (currentPlayer == 'X') {
                currentPlayer = 'Y';
            } else {
                currentPlayer = 'X';
            }
        }

    }
}

