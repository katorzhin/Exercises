

public class SnakeArc {
    public static void main(String[] args) {
        int[][] array = new int[5][5];


        snake(array);
        printMatrix(array);
        System.out.println(array[1][4]);

    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void snake(int[][] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == array[i][array.length - 1]) {
                array[i][array.length - 1 - i] = count++;
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = count++;

                }
            }


        }
    }
}
