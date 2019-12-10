public class CounterTime {
    public static void countTime(int number) {
        int hours = number / 60;
        int minutes = number - (60 * hours);
        if (minutes % 60 == 0) {
            System.out.println(hours + " hours.");
        } else {
            System.out.println(hours + " hours and " + minutes + " minutes.");
        }
    }

    public static void main(String[] args) {
        countTime(1000);
    }
}

