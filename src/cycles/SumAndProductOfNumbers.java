package cycles;

public class SumAndProductOfNumbers {
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

    public static void functionValueTable(double x1,double x2,double up){
        double y;
        while (x1 <= x2) {
            y = -0.23 * x1 * x1 + x1;
            System.out.println(x1 + " -> " + y);
            x1 = x1 + up;
        }
    }
    public static void main(String[] args) {


        sumOfNumber(3254);
        productOfNumbers(123);

    }
}
