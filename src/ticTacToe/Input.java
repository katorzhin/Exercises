package ticTacToe;

import java.util.Scanner;

import static ticTacToe.App.*;

public class Input {
    public static void enterTurn(char[][] myArray, Scanner scanner) {
        System.out.println("TURN " + currentPlayer);
        while (true) {
            String input = scanner.nextLine();
            String[] coordinates = input.split(" ");
            int secondIndex = Integer.parseInt(coordinates[1]);
            int firstIndex = Integer.parseInt(coordinates[0]);
            boolean badFirstInput = firstIndex >= myArray.length || firstIndex < 0;
            boolean badSecondInput = secondIndex >= myArray.length || secondIndex < 0;
            if (badFirstInput || badSecondInput
                    || (myArray[firstIndex][secondIndex] == playerX
                    || myArray[firstIndex][secondIndex] == playerZero)) {
                System.out.println("Please correct index!");
            } else {
                myArray[firstIndex][secondIndex] = currentPlayer;
                break;
            }
        }
    }
}
