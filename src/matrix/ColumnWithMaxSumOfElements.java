package matrix;

import java.util.Arrays;

public class ColumnWithMaxSumOfElements {

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumOfArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int getMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void sumOfColumn(int[][] array) {
        int sumFirstColumn = 0;
        int sumSecondColumn = 0;
        int sumThirdColumn = 0;

        for (int i = 0; i < array.length; i++) {
            sumFirstColumn += array[i][0];
        }

        for (int i = 0; i < array.length; i++) {
            sumSecondColumn += array[i][1];
        }

        for (int i = 0; i < array.length; i++) {
            sumThirdColumn += array[i][2];
        }
        System.out.print(sumFirstColumn + " " + sumSecondColumn + " " + sumThirdColumn + " ");
        if (sumFirstColumn > sumSecondColumn && sumFirstColumn > sumThirdColumn) {
            System.out.println("First column,sum " + sumFirstColumn);
        } else if (sumSecondColumn > sumFirstColumn && sumSecondColumn > sumThirdColumn) {
            System.out.println("Second column,sum " + sumSecondColumn);
        } else {
            System.out.println("Third column,sum " + sumThirdColumn);
        }

    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        int[] array1 = {1, 2, 3, 1, 1, 5, 10, 11};

        printMatrix(array);
        sumOfColumn(array);

    }
}
