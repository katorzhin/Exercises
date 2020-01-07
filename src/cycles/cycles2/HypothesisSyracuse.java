package cycles.cycles2;

public class HypothesisSyracuse {
    public static void main(String[] args) {
        int firstNumber = 777;
        int secondNumber = 788;
        int tmp;
        for (int i = firstNumber; i < secondNumber; i++) {
            tmp = i;
            while (tmp != 1) {
                if (tmp % 2 == 0) {
                    tmp = tmp / 2;
                } else {
                    tmp = (tmp * 3 + 1) / 2;
                }
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }
}
