import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

import java.util.Scanner;

class Test {
    public static void test() {
        System.out.println("hello");
    }

    public static void countIncrement(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("result = " + result);
    }
    public static void countInterval(int inputNumber){

        int sum =0;
        for (int i = 0; i < 14; i++) {

            sum+=inputNumber;
            System.out.print(sum+" ");
        }
    }
    public static void taskTwo(){
        int firstNumber=1;

        int result= 0;
        for (int i = 0; i < 10; i++) {
            int sum=firstNumber+firstNumber;
            result*=sum;
            System.out.println(result);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
//        int inputNumber = scanner.nextInt();
//        countIncrement(inputNumber);
//        countInterval(2);
        taskTwo();

    }
}