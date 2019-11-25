package strings;

public class AmountOfWords {
    public static void main(String[] args) {
        String string = "hello";
        int count = 0;
        for (String i : string.split(" ")) {
            count++;
        }
        System.out.println(count);
    }
}

