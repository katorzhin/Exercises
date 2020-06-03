package task_11;

public class Task_1313 {
     int ds;
    public static int decompressRLElist(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[nums.length]){
                nums[nums.length]=count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] nums2 = {1,2,3,4,2};
        System.out.println(decompressRLElist(nums));


    }
}
