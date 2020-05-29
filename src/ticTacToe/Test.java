package ticTacToe;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
 char[][] array = new char[10] [10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println();
            }
        }
    }
}
