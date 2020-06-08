package tasksCodeWars;

public class Solution {
    public static int countCentury(int year) {
        year += 99;
        year /= 100;
        return year;
    }

    public static int[] monkeyCount(final int n) {
        int count = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = count++;
        }
        return array;
    }

    public static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static int[] invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        return arr;
    }

    public static int findSmallestInt(int[] args) {
        int number = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < number) {
                number = args[i];
            }
        }
        return number;
    }

    public static String well(String[] x) {
        // TODO
        int good = 0;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i].equals("good")) {
                good++;
            }
            if (good > 0 && good <= 2) {
                return "Publish";
            }
            if (good == 0) {
                return "Fail";
            }
            if (good > 2) {
                return "I smell a series!";
            }
        }
        return null;
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int negativeNumbers = 0;
        int positiveNumbers = 0;
        if (input == null || input.length == 0) {
            return input = new int[0];
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                negativeNumbers += input[i];
            }
            if (input[i] > 0) {
                positiveNumbers++;
            }
        }
        int[] expectedResult = new int[2];
        input = new int[2];
        input[0] = positiveNumbers;
        input[1] = negativeNumbers;
        return input;
    }

    public static String abbrevName(String name) {
        name = name.toUpperCase();
        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
    }

    public static int nthEven(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            count += 2;
        }
        return count;
    }

    public static String noSpace(final String x) {
        String result = x;
        result = result.replaceAll(" ", "");
        return result;
    }

    public static boolean isDigit(String s) {
        char[] array = s.toCharArray();
        boolean tmp = true;
        if (s.equals("")) {
            tmp = false;
        }
        for (int i = 0; i < array.length; i++) {
            if (!Character.isDigit(array[i])) {
                tmp = false;
            }
        }
        return tmp;
    }
}

