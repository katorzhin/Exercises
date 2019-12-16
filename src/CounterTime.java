public class CounterTime {

    public static String countTime(int number) {
        int seconds = number % 60;
        int minutes = (number / 60) % 60;
        int hours = number / 3600;

        String secondsValue = seconds + " s.";
        String hoursValue = hours == 0 ? "" : hours + " h. ";
        String minutesValue = minutes != 0 || hours != 0 ? minutes + " m. " : "";
        return hoursValue + minutesValue + secondsValue;

    }

    public static void main(String[] args) {
        System.out.println(countTime(4000));
    }
}

