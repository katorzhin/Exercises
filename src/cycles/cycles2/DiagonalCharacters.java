package cycles.cycles2;

public class DiagonalCharacters {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                if (i==j||i == 20 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
