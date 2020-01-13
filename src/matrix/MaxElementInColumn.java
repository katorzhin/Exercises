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
        int SumFirstColumn = 0;
        int SumSecondColumn = 0;
        int SumThirdColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                SumFirstColumn += array[i][0];
                SumSecondColumn += array[i][1];
                SumThirdColumn += array[i][2];
                System.out.print("- ");
            }
        }
        System.out.print("\n" + SumFirstColumn + " " + SumSecondColumn + " " + SumThirdColumn);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        printMatrix(array);
        maxColumnElement(array);

    }
}
