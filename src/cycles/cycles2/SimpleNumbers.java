package cycles.cycles2;

public class SimpleNumbers {
    public static void main(String[] args) {
        int number = 5;
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("compound number");
        }else  {
            System.out.println("simple number");
        }
    }
}
