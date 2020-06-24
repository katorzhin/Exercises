package tasksCodeWars;

import java.util.Arrays;

public class SolutionPartTwo {
    public static int Past(int h, int m, int s) {
        int second = 1000;
        int minutes = 60_000;
        int hour = 3_600_000;
        int sum = h * hour + m * minutes + s * second;
        return sum;
    }

    public static int points(String[] games) {
        StringBuilder stringBuilder = new StringBuilder();
        int res = 0;
        for (String game : games) {
            String[] split = game.split(":");
            int player1 = Integer.parseInt(split[0]);
            int player2 = Integer.parseInt(split[1]);
            if (player1 > player2) {
                res += 3;
            } else if (player1 == player2) {
                res += 1;
            }
        }
        return res;
    }

    public static String[] capitalize(String s) {
        String strToUpperCase = s.toUpperCase();
        String tmp = "";
        String tmp2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                tmp += strToUpperCase.charAt(i);
                tmp2 += s.charAt(i);
            } else {
                tmp += s.charAt(i);
                tmp2 += strToUpperCase.charAt(i);
            }
        }
        return new String[]{tmp, tmp2};
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count += arr1[i];
            count += arr2[i];
        }
        return count;
    }

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].equals(x));
            if (a[i] == x ) {
                return true;
            }
        }
//        return Arrays.asList(a).contains(x);
        return false;
    }
    public static int sum(int[] arr){
        int countSumPositive =0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i]<0)) {
            countSumPositive+=arr[i];
            }else {
                continue;
            }
        }
        return countSumPositive;
    }

}

