package cycles.cycles2;

public class NumberOfDividers {
    public static void main(String[] args) {
        int minNumber = 343;
        int maxNUmber = 434;
        int m = 0;
        int n = 20;
        while (minNumber <= maxNUmber) {
            for (int i = 1; i < minNumber; i++)
                if (minNumber % i == 0)
                    m++;
                if (m >= n) {
                    System.out.print(minNumber + " - " + m);
                    for (int j = 1; j < minNumber; j++)
                        if (minNumber % j == 0)
                            System.out.print(j + " ");
                    System.out.println();



                }
            minNumber++;
            }

    }
}
