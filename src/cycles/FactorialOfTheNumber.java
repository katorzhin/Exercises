package cycles;

import java.util.Scanner;

public class FactorialOfTheNumber {
    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i < number; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        System.out.println("Factorial of the number " + number + " = " + calculateFactorial(number));
    }
}
