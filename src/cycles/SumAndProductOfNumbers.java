package cycles;

public class SumAndProductOfNumbers {
    public static void main(String[] args) {
        int number = 325;
        int sum = 0;
        while (number > 0) {
            number = sum + number % 10;
            sum = number / 10;
        }
        System.out.println(number);
    }
}
