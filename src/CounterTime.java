public class CounterTime {
//    public static String countTime(int number) {
//        int hours = number / 60;
//        int minutes = number - (60 * hours);
//        if (minutes % 60 == 0) {
//            return hours + " hours.";
//        } else {
//            return hours + " hours and " + minutes + " minutes.";
//        }
//    }
    public static String countTime(int number) {

        int seconds = number / 60;
        int minutes = number - (60 * seconds);
        int tmp= minutes%60;
        int hours=number/3600;
        if (minutes % 60 == 0) {
            return seconds + " minutes.";
        } else {
            return seconds + " minutes and " + minutes + " seconds.";
        }else if (number>3600){
            return hours+" hours "+tmp+" minutes "+seconds+" seconds.";
        }

    }
    public static void main(String[] args) {
//        System.out.println(countTime(4000));
        int a = 66%60;
        System.out.println(a);
    }
}

