package polymorphism;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20);


        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer);
        for (Dancer d : discotheque) {
            d.dance();
        }
    }
}