package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FillingAndOutputtingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] firstArray = new int[3];
        int[] secondArray = new int[3];
        int[] thirdArray = new int[3];

        for (int i = 0; i < 3; i++) {
            firstArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            secondArray[i] = random.nextInt(100);
        }
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = firstArray[i] + secondArray[i];
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));


    }
}
