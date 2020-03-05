public class SnakeInSquare {
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void lineToRight(int[][] arraySquare, int a, int b, int length, int number) {
        for (int i = 0; i < length; i++) {
            arraySquare[a][b++] = number++;
        }
    }

    public static void lineToDown(int[][] arraySquare, int a, int b, int length, int number) {
        for (int i = 0; i < length; i++) {
            arraySquare[a++][b] = number++;
        }
    }

    public static void lineToLeft(int[][] arraySquare, int a, int b, int length, int number) {
        for (int i = 0; i < length; i++) {
            arraySquare[a][b--] = number++;
        }
    }

    public static void lineToUp(int[][] arraySquare, int a, int b, int length, int number) {
        for (int i = 0; i < length; i++) {
            arraySquare[a--][b] = number++;
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int start = 0;
        int tmp=2;
        lineToRight(array, start, start, array.length, start + 1);
        lineToDown(array, start + 1, array.length - 1, array.length - 1, array.length + 1);
        lineToLeft(array, array.length - 1, array.length - 2, array.length - 1, array.length * 2);
        lineToUp(array, array.length - 2, start, array.length - 2, array.length * 3 - 1);


        lineToRight(array,start+1,start+1,array.length-2,array.length*4-3);
        lineToDown(array,tmp,array.length-2,array.length-3,array.length*5-5);

        printMatrix(array);

    }
}
