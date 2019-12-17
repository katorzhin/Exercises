package arrays;

import java.util.Arrays;

public class QuantityOfDifferentElementsOfArray {
    public static void main(String[] args) {
        int[] array = new int[20];
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (9 + 1)) - 5;
            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] < 0) {
                countNegative++;
            } else if (array[i] == 0) {
                countZero++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("positive numbers " + countPositive);
        System.out.println("negative numbers " + countNegative);
        System.out.println("equal to zero " + countZero);

        int[] arrayA = {1, 2, 3, 4, 5};

        sumAndProductOfArrayElements(arrayA);
    }

    public static void sumAndProductOfArrayElements(int[] array) {
        int sum = 0;
        int productOfElements = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            productOfElements *= array[i];
        }
        System.out.println("Sum  of array elements " + sum);
        System.out.println("product of array elements " + productOfElements);
    }
}
