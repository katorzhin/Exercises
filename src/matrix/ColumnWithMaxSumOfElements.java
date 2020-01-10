package matrix;

import java.util.Arrays;

public class ColumnWithMaxSumOfElements {
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

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        int[] array1 = {1, 2, 3, 1, 1, 5, 10, 11};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        int sumFirstColumn = 0;
        int sumSecondColumn = 0;
        int sumThirdColumn = 0;
        int sumFourthColumn = 0;
        int sumFifthColumn = 0;

        for (int i = 0; i < array.length; i++) {
            sumFirstColumn += array[i][0];
        }
        System.out.println(sumFirstColumn);
        for (int i = 0; i < array.length; i++) {
            sumSecondColumn += array[i][1];
        }
        System.out.println(sumSecondColumn);
        for (int i = 0; i < array.length; i++) {
            sumThirdColumn += array[i][2];
        }
        System.out.println(sumThirdColumn);
        for (int i = 0; i < array.length; i++) {
            sumFourthColumn += array[i][3];
        }
        System.out.println(sumFourthColumn);
        for (int i = 0; i < array.length; i++) {
            sumFifthColumn += array[i][4];
        }
        System.out.println(sumFifthColumn);




    }
}
