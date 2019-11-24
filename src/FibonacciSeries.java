public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        int result;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 3; i <= 11; i++) {
            result = firstNumber + secondNumber;
            System.out.print(result + " ");
            firstNumber = secondNumber;
            secondNumber = result;
        }
    }
}


