public class CounterTime {
    public static void main(String[] args) {
        int number = 110;
        int hours = 0;
        int minutes = 0;
        int result = number / 60;
        if (number % 60 == 0) {
            System.out.println(result + " hours");
        }
    }
}
