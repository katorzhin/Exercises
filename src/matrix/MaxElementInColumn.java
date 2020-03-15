package matrix;

public class MaxElementInColumn {
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void maxColumnElement(int[][] array) {
        int firstColumn = 0;
        int secondColumn = 0;
        int thirdColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][0] > firstColumn) {
                    firstColumn = array[i][0];
                } else if (array[i][1] > secondColumn) {
                    secondColumn = array[i][1];
                } else if (array[i][2] > thirdColumn) {
                    thirdColumn = array[i][2];
                }
            }
            System.out.print("- ");
        }

        System.out.print("\n" + firstColumn + " " + secondColumn + " " + thirdColumn);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 12, 3}, {4, 15, 6}, {17, 8, 9}, {10, 11, 12}, {3, 4, 5}};
        printMatrix(array);
        maxColumnElement(array);
    }
}
