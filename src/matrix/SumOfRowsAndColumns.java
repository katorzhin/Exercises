package matrix;

public class SumOfRowsAndColumns {
    public static void printMatrix(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfRows(int[][] array) {
        int sumFirstRow = 0;
        int sumSecondRow = 0;
        int sumThirdRow = 0;
        for (int i = 0; i < array.length; i++) {
            sumFirstRow += array[0][i];
            sumSecondRow += array[1][i];
            sumThirdRow += array[2][i];
            System.out.print("- ");
        }
        System.out.println("\nsum first row: " + sumFirstRow);
        System.out.println("sum second row: " + sumSecondRow);
        System.out.println("sum third row: " + sumThirdRow);
    }

    public static void columnAmount(int[][] array) {
        int SumFirstColumn = 0;
        int SumSecondColumn = 0;
        int SumThirdColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                SumFirstColumn += array[i][0];
                SumSecondColumn += array[i][1];
                SumThirdColumn += array[i][2];

            }
            System.out.print("- ");
        }
        System.out.println("\n" + SumFirstColumn + " " + SumSecondColumn + " " + SumThirdColumn);
    }

    public static String sumOfDiagonalLeft(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][i];
                    System.out.print(array[i][j] + " ");
            }
        }
        return "\nSum of the diagonal " + sum;
    }

        public static void sumOfDiagonalRight(int[][]array){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum +=array[i][array.length-1-i];
            }
            System.out.println("sum of the right diagonal: "+sum);
    }
    public static void main(String[] args) {
        int[][] array = {{1, 2, 5}, {4, 5, 6}, {5, 8, 9}};
        printMatrix(array);
    }
}
