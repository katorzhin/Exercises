package tasksCodeWars;

public class TestTasks {
    public static int countOddPositionChars(String[] array) {
        if (array != null && array.length > 0) {
            int countOfOddIndexes = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    countOfOddIndexes += array[i].length();
                }
            }
            return countOfOddIndexes;
        }
        return 0;
    }
    public static boolean isEqually(String str) {
        if (str != null && str.length() > 0) {
            String m = "m";
            String n = "n";
            int mCount = 0;
            int nCount = 0;
            String stringToCheck = str.toLowerCase();
            if (!stringToCheck.contains(m) || !stringToCheck.contains(n)) {
                return true;
            }
            for (int i = 0; i < stringToCheck.length(); i++) {
                String currentChar = String.valueOf(stringToCheck.charAt(i));
                if (currentChar.equals(m)) {
                    mCount++;
                }
                if (currentChar.equals(n)) {
                    nCount++;
                }
            }
            return nCount == mCount;
        }
        return false;
    }
    public static int findSmallestElement(int[] nums) {
        if (nums != null && nums.length > 0){
            int number = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < number) {
                    number = nums[i];
                }
            }
            return number;
        }
        return 0;
    }
    public static char getLastCharacter(String input) {
        char str = input.charAt(input.length()-1);
        return str;
    }
    public static int stringLength(String input) {
        if (input != null && input.length() > 0) {
            int countString = input.length();
            return countString;
        }
        return 0;
    }
}
