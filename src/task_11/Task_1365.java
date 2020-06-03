package task_11;

import java.util.Arrays;

public class Task_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArray = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                    newArray[i] = count;
                }
            }
            count = 0;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
