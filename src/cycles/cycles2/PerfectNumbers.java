package cycles.cycles2;

public class PerfectNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
                if (sum == i) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
