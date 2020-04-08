import static matrix.MaxElementInColumn.printMatrix;

public class Task178 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                array[j][4 - j + i] = count++;

            }
        }
        printMatrix(array);
    }
}
