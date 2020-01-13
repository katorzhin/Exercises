package matrix;

public class PositiveDiagonalNumbers {
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String sumOfDiagonal(int[][] array) {
        int sum = 0;
        System.out.println("Positive numbers:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j && array[i][j] > 0) {
                    sum += array[i][j];
                    System.out.print(array[i][j]+" ");
                }

            }
        }
        return "\nSum of the diagonal "+sum;
    }

    public static void main(String[] args) {
        int[][] array = {{-1, 2, 2, 2, 3}, {5, -1, 1, 1, 6}, {7, 7, 7, 2, 5}, {5, 1, 6, 2, 1}, {5, 1, 3, 5, -6}};
        printMatrix(array);
        String tmp = sumOfDiagonal(array);
        System.out.println(tmp);


    }
}
