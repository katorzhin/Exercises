package tasksCodeWars;

import java.util.Arrays;

public class Solution {
    public static int countCentury(int year) {
        year += 99;
        year /= 100;
        return year;
    }

    public static int[] monkeyCount(final int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
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
        String res = "Fail!";
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equalsIgnoreCase("good")) {
                res = "Publish!";
                count++;
                if (count > 2) {
                    return "I smell a series!";
                }
            }
        }
        return res;
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

    public static String remove(String str) {
        String temp = str.substring(1, str.length() - 1);
        return temp;
    }

    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                sum += arr[i] - arr[j];
                i++;
            }
        }
        return sum;
    }

    public static String reverseString(String str) {
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            tmp += str.charAt(str.length() - 1 - i);
        }
        return tmp;
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i = 0; (i < numbers.length); i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                newArray[index] = numbers[i];
                index++;
            }
        }
        return newArray;
    }

    public static int expressionsMatter(int a, int b, int c) {
        //For the stupid task - stupid solution:)

        int result = a * (b + c);

        if (result < (a * b * c)) {
            result = a * b * c;
        }
        if (result < (a + b * c)) {
            result = a + b * c;
        }
        if (result < (a + b) * c) {
            result = (a + b) * c;
        }
        if (result < (a + b + c)) {
            result = a + b + c;
        }
        if (result < a * b + c) {
            result = a * b + c;
        }
        return result;
    }

    public static Integer calculateTip(double amount, String rating) {
        rating = rating.toLowerCase();
        int tip;
        switch (rating) {
            case "terrible":
                return 0;
            case "poor":
                amount *= 0.05;
                amount = Math.ceil(amount);
                tip = (int) amount;
                return tip;
            case "good":
                amount *= 0.1;
                amount = Math.ceil(amount);
                tip = (int) amount;
                return tip;
            case "great":
                amount *= 0.15;
                amount = Math.ceil(amount);
                tip = (int) amount;
                return tip;
            case "excellent":
                amount *= 0.2;
                amount = Math.ceil(amount);
                tip = (int) amount;
                return tip;
            default:
                return null;
        }
    }

    public static String twoSort(String[] strings) {
        int firstWordIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(0) > strings[j].charAt(0)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        String firstWord = strings[firstWordIndex];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            sb.append(firstWord.charAt(i));
            if (i == firstWord.length() - 1) {
                continue;
            }
            sb.append("***");
        }

        return sb.toString();
    }

    public static String[] stringToArray(String str) {
        String[] array = str.split(" ");
        return array;
    }
}

