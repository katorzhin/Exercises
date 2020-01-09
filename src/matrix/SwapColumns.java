package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SwapColumns {
    public static void swapColumns(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        int[] tmp;
        System.out.println("Which columns to swap ?");
        int column = scanner.nextInt();
        int swapColumn = scanner.nextInt();
        System.out.println("Initial array: " + Arrays.deepToString(array));
        tmp = Arrays.copyOf(array[column], array[column].length);
        array[column] = Arrays.copyOf(array[swapColumn], array[swapColumn].length);
        array[swapColumn] = Arrays.copyOf(tmp, tmp.length);
        System.out.println("Modified array: " + Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        swapColumns(array);
    }
}

