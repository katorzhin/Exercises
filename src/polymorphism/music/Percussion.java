package polymorphism.music;

public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play "+n);
    }

    @Override
    String what() {
        return "wind";
    }

    @Override
    void adjust() {
        System.out.println("adjusting percussion");;
    }
}
