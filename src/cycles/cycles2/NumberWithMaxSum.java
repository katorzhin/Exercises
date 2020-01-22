package cycles.cycles2;

public class NumberWithMaxSum {
    public static int sumOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int firstNumber = 789;
        int secondNumber = 1234;
        int thirdNumber = 12345555;

        int sumFirstNumber = sumOfNumber(firstNumber);
        int sumSecondNumber = sumOfNumber(secondNumber);
        int sumThirdNumber = sumOfNumber(thirdNumber);

        if (sumFirstNumber > sumSecondNumber && sumFirstNumber > sumThirdNumber) {
            System.out.println("The number " + firstNumber + " has a max sum of digits " + sumFirstNumber);
        } else if (sumSecondNumber > sumFirstNumber && sumSecondNumber > sumThirdNumber) {
            System.out.println("The number " + secondNumber + " has a max sum of digits " + sumSecondNumber);
        } else {
            System.out.println("The number " + thirdNumber + " has a max sum of digits " + sumThirdNumber);
        }
    }
}
