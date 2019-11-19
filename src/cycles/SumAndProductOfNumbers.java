package cycles;

public class SumAndProductOfNumbers {
    public static void setsOfNaturalNumbers(int number) {
        int sum = 0;
        int mult = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            mult = number * (number + 1) / 2;
        }
        System.out.println(sum + " " + mult);
    }

    public static void functionValueTable(double x1, double x2, double up) {
        double y;
        while (x1 <= x2) {
            y = -0.23 * x1 * x1 + x1;
            System.out.println(x1 + " -> " + y);
            x1 = x1 + up;
        }
    }

    public static void sumOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }

    public static void productOfNumbers(int number) {
        int result = (number / 100) * (number / 10 % 10) * (number % 10);
        System.out.println(result);
    }

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i < number; i++) {
            result = result * i;
        }
        return result;
    }

    public static void sumElementsOfSeriesAndNumbers(int number) {
        float start = 1;
        float sum = 0;
        for (int j = 0; j < number; j++) {
            sum = sum + start;
            start = start / -2;
        }
        System.out.println(sum);
    }

    public static void oddAndEvenNumbers(int number) {
        int even = 0;
        int odd = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;
        }
        System.out.println("Четных " + even);
        System.out.println("Нечетных " + odd);
    }

    public static void numbersInRange(int a, int b, int c) {

        while (a <= b) {
            System.out.print(a + " ");
            a = a + c;
        }
        System.out.println();
    }

    public static void flipNumbers(int number) {
        int m = 0;
        while (number > 0) {
            m = m * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(m);
    }

    public static void main(String[] args) {

    }
}
