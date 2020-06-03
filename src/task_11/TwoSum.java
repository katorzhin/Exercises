package task_11;

import java.util.Arrays;

public class TwoSum {
    public static int[]twoSum(int[]array,int target){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i]+array[j]==target){
                    newArray[0]=i;
                    newArray[1]=j;

                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] givenNums = {11, 15, 2, 7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(givenNums, 9)));
    }
}
