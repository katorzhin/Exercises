package arrays;

import java.util.Arrays;


public class InsertElementIntoArray {
    public static void main(String[] args) {

        int[] array = {33, 2, 5, 9, 1, 55, 4, 21};

        int[] newArray = new int[array.length + 1];

        System.arraycopy(array, 0, newArray, 0, 5);
        newArray[5]=2;
        System.arraycopy(array,5,newArray,6,3);


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}
