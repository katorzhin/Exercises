package polymorphism.music;

public class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("wind.play "+n);
    }

    @Override
    String what() {
        return "wind";
    }

    @Override
    void adjust() {
        System.out.println("adjusting wind");
    }
}
